package com.jackframe.java_design_patterns.wu;

import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;

/**
 * 周瑜，三国周郎赤壁
 * @author wjf
 *
 */
public class ZhouYuGeneral implements General {

	static final String NAME = "周瑜";
	Kingdom kindom;
	
	public ZhouYuGeneral(Kingdom kindom) {
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
