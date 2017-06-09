package com.jackframe.design_patterns.business_delegate;

/**
 * 
 * 邮件相关的业务实现
 * 
 * @author wjf
 *
 */
public class EmailService implements BusinessService {

	public void doProcessing() {
		
		System.out.println("这是邮件相关的业务实现！");

	}

}
