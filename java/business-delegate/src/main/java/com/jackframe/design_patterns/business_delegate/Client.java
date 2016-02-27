package com.jackframe.design_patterns.business_delegate;

/**
 * 
 * 业务请求方
 * 
 * @author wjf
 *
 */
public class Client {

	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		super();
		this.businessDelegate = businessDelegate;
	}
	
	public void doTask() {
		businessDelegate.doTask();
	}
}
