package com.jackframe.java_design_patterns.wu;

import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.Politician;

/**
 * 张昭，外事不决问周瑜，内事不决问张昭
 * @author wjf
 *
 */
public class ZhangZhaoPolitician implements Politician {

	static final String NAME = "张昭";
	Kingdom kindom;
	
	public ZhangZhaoPolitician(Kingdom kindom) {
		this.kindom = kindom;
	}
	
	public String getName() {
		return NAME;
	}

	public String getNationality() {
		if(kindom != null) {
			return kindom.getName();
		}
		return "自由职业者";
	}

}
