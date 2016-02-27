package com.jackframe.design_patterns.business_delegate;

/**
 * 业务代理模式在实现和业务之间增加了一层抽象层。通过业务代理模式，解耦实现层和具体业务。业务代理主要提供怎么定位业务，
 * 怎么连接具体的业务，怎么接收业务返回的数据。
 * 
 * 一些业务代理模式直接实例化，而另一些通过服务检查来确定提供的具体服务。
 * 业务代理本身也可能包含业务逻辑，比如调用多个业务服务，异常处理，重新调用服务。
 *
 */
public class App {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		BusinessLookup businessLookup = new BusinessLookup();
		businessLookup.setEmailService(new EmailService());
		businessLookup.setMobileService(new MobileService());

		businessDelegate.setBussinessLookup(businessLookup);
		businessDelegate.setServiceType(ServiceType.MOBILE);

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType(ServiceType.EMAIL);
		client.doTask();
	}
}
