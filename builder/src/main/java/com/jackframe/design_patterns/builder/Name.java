package com.jackframe.design_patterns.builder;

/**
 * 
 * 英雄名称
 * 
 * @author wjf
 *
 */
public enum Name {

	LIUBEI("刘备"), ZHANGFEI("张飞"), GUANYU("关羽");
	
	private String name; //名字
	
	Name(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
