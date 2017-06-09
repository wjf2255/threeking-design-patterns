package com.jackframe.java_design_patterns.shu;

import com.jackframe.java_design_patterns.City;
import com.jackframe.java_design_patterns.General;
import com.jackframe.java_design_patterns.Kingdom;
import com.jackframe.java_design_patterns.KingdomFactory;
import com.jackframe.java_design_patterns.King;
import com.jackframe.java_design_patterns.Politician;

/**
 * 蜀国构建器
 * @author wjf
 *
 */
public class ShuKingdomFactory implements KingdomFactory {

	public Kingdom createKindom() {
		return new ShuKingdom();
	}

	public King createKing() {
		return new LiuBeiKing();
	}

	public General createGeneral(Kingdom kindom) {
		return new GuanYuGeneral(kindom);
	}

	public Politician createPolitician(Kingdom kindom) {
		return new ZhuGeLiangPolitician(kindom);
	}

	public City createCity() {
		return new ChengDuCity();
	}

}
