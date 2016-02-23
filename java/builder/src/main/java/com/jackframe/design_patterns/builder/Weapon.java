package com.jackframe.design_patterns.builder;

/**
 * 
 * 使用的武器
 * @author wjf
 *
 */
public enum Weapon {

	QINGLONGYANYUEDAO("青龙偃月刀"), BANGZHANGSHEMAO("丈八蛇矛"), CHIXIONGSHUANGJIAN("雌雄双剑");
	
	private String name; //武器名称
	
	Weapon(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
