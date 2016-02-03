package com.jackframe.java_design_patterns.wu;

import com.jackframe.java_design_patterns.City;
import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.KingdomFactory;
import com.jackframe.java_design_patterns.King;
import com.jackframe.java_design_patterns.Politician;

/**
 * 吴国构建器
 * @author wjf
 *
 */
public class WuKingdomFactory implements KingdomFactory {

	public Kingdom createKindom() {
		return new WuKingdom();
	}

	public King createKing() {
		return new SunQuanKing();
	}

	public General createGeneral(Kingdom kindom) {
		return new ZhouYuGeneral(kindom);
	}

	public Politician createPolitician(Kingdom kindom) {
		return new ZhangZhaoPolitician(kindom);
	}

	public City createCity() {
		return new JianYeCity();
	}

}
