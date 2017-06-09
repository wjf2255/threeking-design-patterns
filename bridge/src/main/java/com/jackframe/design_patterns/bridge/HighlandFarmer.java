package com.jackframe.design_patterns.bridge;

/**
 * 山越民族。产山珍，石料，矿等
 * @author wjf
 *
 */
public abstract class HighlandFarmer extends Farmer {

	public HighlandFarmer() {
		inefficient = 0.2;		//农业低效
	}
	
	public abstract void delicacyFromMountain();
}
