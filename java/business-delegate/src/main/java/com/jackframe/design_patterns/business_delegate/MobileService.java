package com.jackframe.design_patterns.business_delegate;

/**
 * 
 * 具体的手机短信相关的业务实现
 * 
 * @author wjf
 *
 */
public class MobileService implements BusinessService {

	public void doProcessing() {
		System.out.println("这是手机业务的相关实现");
	}

}
