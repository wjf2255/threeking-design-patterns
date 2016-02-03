package com.jackframe.java_design_patterns.shu;

import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;

/**
 * 关羽，最出名的是义气。古惑仔里，黑道都敬拜他
 * @author wjf
 *
 */
public class GuanYuGeneral implements General {

	static final String NAME = "关羽";
	
	Kingdom kindom;
	
	public GuanYuGeneral(Kingdom kindom) {
		this.kindom = kindom;
	}
	
	public String getName() {
		return NAME;
	}

	public String getNationality() {
		return kindom.getName();
	}

}
