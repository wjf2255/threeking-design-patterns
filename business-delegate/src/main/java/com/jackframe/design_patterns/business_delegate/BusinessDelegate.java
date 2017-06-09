package com.jackframe.design_patterns.business_delegate;

/**
 * 
 * 业务代表
 * 
 * @author wjf
 *
 */
public class BusinessDelegate {

	private BusinessLookup bussinessLookup;
	private BusinessService bussinessService;
	private ServiceType serviceType;
	
	public void setBussinessLookup(BusinessLookup bussinessLookup) {
		this.bussinessLookup = bussinessLookup;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		bussinessService = bussinessLookup.getBusinessService(serviceType);
		bussinessService.doProcessing();
	}
}
