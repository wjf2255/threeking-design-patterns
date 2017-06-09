package com.jackframe.java_design_patterns.shu;

import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.Politician;

/**
 * 诸葛亮，据说是神算子
 * @author wjf
 *
 */
public class ZhuGeLiangPolitician implements Politician {

	static final String NAME = "诸葛亮";
	Kingdom kindom;
	
	public ZhuGeLiangPolitician(Kingdom kindom) {
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
