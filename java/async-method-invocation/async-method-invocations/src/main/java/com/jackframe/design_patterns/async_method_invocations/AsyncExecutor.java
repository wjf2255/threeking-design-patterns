package com.jackframe.design_patterns.async_method_invocations;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * 
 * AsyncExecutor interface
 *
 */
public interface AsyncExecutor {

	/**
	 * 开启一个异步任务调度的线程执行任务。立即返回一个异步结果。
	 * 
	 * @param task 被异步处理的任务
	 * @return 异步处理结果
	 */
	public <T> AsyncResult<T> startProcess(Callable<T> task);
	
	/**
	 * 开启一个异步任务调度的线程执行任务。立即返回一个异步结果。如果任务执行结束，则调用callback
	 * 
	 * @param task 被异步处理的任务
	 * @param callback 任务执行结束，则调用callback
	 * @return 异步处理结果
	 */
	public <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback);
	
	/**
	 * 结束一个正在执行的任务。如果有必要会阻塞进程，并返回任务执行的结果
	 * 
	 * @param asyncResult 异步处理结果
	 * @return 异步处理结果
	 * @throws ExecutionException 如果异步任务执行过程中出现异常，则抛出该错误
	 * @throws InterruptedException 如果异步任务本身处在阻塞状态，则抛出该异常
	 */
	public <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;
}
