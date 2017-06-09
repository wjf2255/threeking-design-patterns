package com.jackframe.design_patterns.builder;

/**
 * 
 * 武将或者文官所属阵营的名称
 * @author wjf
 *
 */
public enum Nation {

	WEI("魏"), SHU("蜀"), WU("吴");
	
	private String name; //国家名称

	Nation(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
