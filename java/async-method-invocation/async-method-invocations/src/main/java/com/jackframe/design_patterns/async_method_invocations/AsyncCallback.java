package com.jackframe.design_patterns.async_method_invocations;

import java.util.Optional;

/**
 * 
 * AsyncCallback 
 *
 * @param <T>
 */
public interface AsyncCallback<T> {

	/**
	 * 
	 * 当异步任务完成或者抛出异常时，执行该操作。
	 * 
	 * @param value 异步任务执行的结果。如果失败则返回未定义的内容
	 * @param ex 如果任务成功执行，则返回空结果；如果执行失败，则返回某种异常
	 */
	public void onComplete(T value, Optional<Exception> ex);
}
