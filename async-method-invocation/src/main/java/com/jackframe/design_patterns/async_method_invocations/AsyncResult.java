package com.jackframe.design_patterns.async_method_invocations;

import java.util.concurrent.ExecutionException;

/**
 * 
 * 异步任务执行状态与结果
 *
 */
public interface AsyncResult<T> {

	/**
	 * 异步任务的执行状态
	 * 
	 * @return <code>true</code> 异步任务执行完毕或者执行失败
	 */
	public boolean isCompleted();
	
	/**
	 * 获取异步方法执行结果
	 * 
	 * @return 返回异步方法执行结果，如果执行出错抛出一个ExecutionException
	 * @throws ExecutionException 如果任务执行出错，则抛出ExecutionException
	 * @throws IllegalStateException 如果任务未执行完成，则抛出IllegalStateException
	 */
	public T getValue() throws ExecutionException;
	
	/**
	 * 阻塞当前进程，直到异步任务执行完毕
	 * 
	 * @throws InterruptedException 如果当前任务是阻塞状态（interrupted）
	 */
	public void await() throws InterruptedException;
}
