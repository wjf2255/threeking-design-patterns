package com.jackframe.design_patterns.chain;

import java.util.Objects;

/**
 * 
 * 定义请求，包含请求类型和请求描述。
 * 
 * @author wjf
 *
 */
public class Request {

	private final RequestType requestType;

	private final String requestDescription;

	private boolean handled = false;

	public Request(final RequestType requestType,
			final String requestDescription) {
		this.requestType = Objects.requireNonNull(requestType);
		this.requestDescription = Objects.requireNonNull(requestDescription);
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void markHandled() {
		this.handled = true;
	}

	public boolean isHandled() {
		return this.handled;
	}

	public String toString() {
		return getRequestDescription();
	}
}
