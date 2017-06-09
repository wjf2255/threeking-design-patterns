package com.jackframe.design_patterns.async_method_invocations;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * 异步执行器的实现。为每个任务起一个线程执行该任务。
 *
 */
public class ThreadAsyncExecutor implements AsyncExecutor {

	/**  */
	private final AtomicInteger idx = new AtomicInteger(0);
	
	public <T> AsyncResult<T> startProcess(Callable<T> task) {
		return startProcess(task, null);
	}

	public <T> AsyncResult<T> startProcess(Callable<T> task,
			AsyncCallback<T> callback) {
		CompletableResult<T> result = new CompletableResult<>(callback);
		new Thread(() -> {
			try {
				result.setValue(task.call());
			} catch (Exception e) {
				result.setException(e);
			}
		}, "executor-" + idx.incrementAndGet()).start();
		return result;
	}

	public <T> T endProcess(AsyncResult<T> asyncResult)
			throws ExecutionException, InterruptedException {
		if(asyncResult.isCompleted()) {
			return asyncResult.getValue();
		} else {
			asyncResult.await();
			return asyncResult.getValue();
		}
	}

	private static class CompletableResult<T> implements AsyncResult<T> {

		static final int RUNNING = 1;
		static final int FAILED = 2;
		static final int COMPLETED = 3;
		
		final Object lock;
		final Optional<AsyncCallback<T>> callback;
		
		volatile int state = RUNNING;
		T value;
		Exception exception;
		
		CompletableResult(AsyncCallback<T> callback) {
			this.lock = new Object();
			this.callback = Optional.ofNullable(callback);
		}
		
		/**
		 * 设置异步任务执行结束后得到的执行结果。如果有callback,则调用callback方法。唤醒其他等待的线程。
		 * 
		 * @param value 异步任务执行结果
		 */
		void setValue(T value) {
			this.value = value;
			this.state = COMPLETED;
			this.callback.ifPresent(ac -> ac.onComplete(value, Optional.<Exception>empty()));
		    synchronized (lock) {
		    	lock.notifyAll();
		    }
		}
		
		/**
		 * 检查当前的异步任务是否执行完毕
		 * 
		 * @return true表示当前的异步任务执行完毕，否则执行中
		 */
		public boolean isCompleted() {
			return state > RUNNING;
		}

		public T getValue() throws ExecutionException {
			if (state == COMPLETED) {
		        return value;
		      } else if (state == FAILED) {
		        throw new ExecutionException(exception);
		      } else {
		        throw new IllegalStateException("Execution not completed yet");
		      }
		}
		
		public void setException(Exception exception) {
			this.exception = exception;
			this.state = FAILED;
			this.callback.ifPresent(ac -> ac.onComplete(null, Optional.of(exception)));
			synchronized (lock) {
				lock.notifyAll();
			}
		}

		public void await() throws InterruptedException {
			synchronized (lock) {
		        if (!isCompleted()) {
		          lock.wait();
		        }
		      }
		}
		
	}
}