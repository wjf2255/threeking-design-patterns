package com.jackframe.java_design_patterns.wei;

import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;

/**
 * 曹仁，曹操非常倚重的武将
 * @author wjf
 *
 */
public class CaoRenGeneral implements General {

	static final String NAME = "曹仁";
	
	Kingdom kindom = null;
	
	public CaoRenGeneral(Kingdom kindom) {
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
