package com.jackframe.java_design_patterns.wei;

import com.jackframe.java_design_patterns.City;
import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.KingdomFactory;
import com.jackframe.java_design_patterns.King;
import com.jackframe.java_design_patterns.Politician;

/**
 * 魏国构建器
 * @author wjf
 *
 */
public class WeiKingdomFactory implements KingdomFactory {

	public King createKing() {
		return new CaocaoKing();
	}

	public Politician createPolitician(Kingdom kindom) {
		return new GuoJiaPolitician(kindom);
	}

	public City createCity() {
		return new XuChangCity();
	}

	public Kingdom createKindom() {
		return new WeiKingdom();
	}

	public General createGeneral(Kingdom kindom) {
		return new CaoRenGeneral(kindom);
	}

}
