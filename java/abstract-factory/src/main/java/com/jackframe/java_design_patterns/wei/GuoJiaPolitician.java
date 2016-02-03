package com.jackframe.java_design_patterns.wei;

import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.Politician;

/**
 * 郭嘉，曹操最重要的谋臣之一(个人意见：最重要的谋臣，没有之一)
 * @author wjf
 *
 */
public class GuoJiaPolitician implements Politician {
	
	static final String NAME = "郭嘉";
	Kingdom kindom = null;
	
	public GuoJiaPolitician(Kingdom kindom) {
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
