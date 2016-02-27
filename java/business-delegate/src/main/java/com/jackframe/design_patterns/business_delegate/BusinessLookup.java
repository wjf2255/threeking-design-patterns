package com.jackframe.design_patterns.business_delegate;

/**
 * 
 * 定义服务的类型
 * 
 * @author wjf
 *
 */
public class BusinessLookup {

	private EmailService emailService;
	private MobileService mobileService;
	
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	public void setMobileService(MobileService mobileService) {
		this.mobileService = mobileService;
	}
	
	public BusinessService getBusinessService(ServiceType serviceType) {
		switch(serviceType) {
			case EMAIL:return emailService;
			case MOBILE: return mobileService;
			default: return null;
		}
	}
}
