package com.jackframe.design_patterns.caching;

/**
 * 
 * 缓存策略
 * 
 * @author wjf
 *
 */
public enum CachingPolicy {
	
	THROUGH("through"), BEFORE("before"), AFTER("after");
	
	private String policy;
	
	private CachingPolicy(String policy) {
		this.policy = policy;
	}

	public String getPolicy() {
		return policy;
	}
}
