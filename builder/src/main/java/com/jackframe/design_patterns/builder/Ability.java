package com.jackframe.design_patterns.builder;

/**
 * 
 * 武将或者文臣的技能
 * 
 * @author wjf
 *
 */
public enum Ability {
	
	SHENSUAN("神算"), BAQICELOU("霸气侧漏"), WEIZHENHUAXIA("威震华夏"), DUNZOU("遁走");

	private String name; //技能名称；
	
	Ability(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
