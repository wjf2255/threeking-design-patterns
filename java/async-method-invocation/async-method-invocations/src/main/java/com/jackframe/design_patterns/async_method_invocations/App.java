package com.jackframe.design_patterns.async_method_invocations;

import java.util.concurrent.Callable;

/**
 * 
 *
 */
public class App {

	/**
	 * Program entry point
	 */
	public static void main(String[] args) throws Exception {
		// construct a new executor that will run async tasks
		AsyncExecutor executor = new ThreadAsyncExecutor();

		AsyncResult<Integer> asyncResult1 = executor.startProcess(lazyval(10, 500));
		AsyncResult<String> asyncResult2 = executor.startProcess(lazyval("test", 300));
		AsyncResult<Long> asyncResult3 = executor.startProcess(lazyval(50L, 700));
		AsyncResult<Integer> asyncResult4 = executor.startProcess(lazyval(20, 400), callback("Callback result 4"));
		AsyncResult<String> asyncResult5 = executor.startProcess(lazyval("callback", 600), callback("Callback result 5"));

		// emulate processing in the current thread while async tasks are
		// running in their own threads
		asyncResult4.await();
		log("Result 4: " + asyncResult4.getValue());
		Thread.sleep(350); // Oh boy I'm working hard here
		log("Some hard work done");

		// wait for completion of the tasks
		Integer result1 = executor.endProcess(asyncResult1);
		String result2 = executor.endProcess(asyncResult2);
		Long result3 = executor.endProcess(asyncResult3);
	    asyncResult4.await();
	    asyncResult5.await();

		// log the results of the tasks, callbacks log immediately when complete
		log("Result 1: " + result1);
		log("Result 2: " + result2);
		log("Result 3: " + result3);
		log("Result 4: " + asyncResult4.getValue());
	}
	
	/**
	 * 创建一个callable对象，模拟被执行的任务。
	 * 
	 * @param value 具体的结果
	 * @param delayMillis 任务执行的时间，以毫秒为单位
	 * @return Callable对象
	 */
	private static <T> Callable<T> lazyval(T value, long delayMillis) {

		return () -> {
			Thread.sleep(delayMillis);
			log("Task completed with: " + value);
			return value;
		};
	}
	
	/**
	 * 创建一个简单的callback对象，用于记录异步任务完成结果的状态
	 * 
	 * @param name 任务名称
	 * @return
	 */
	private static <T> AsyncCallback<T> callback(String name) {
		return (value, ex) -> {
			if (ex.isPresent()) {
				log(name + " failed: "
						+ ex.map(Exception::getMessage).orElse(""));
			} else {
				log(name + ": " + value);
			}
		};
	}

	private static void log(String msg) {
		System.out.println(String.format("[%1$-10s] - %2$s", Thread
				.currentThread().getName(), msg));
	}
}