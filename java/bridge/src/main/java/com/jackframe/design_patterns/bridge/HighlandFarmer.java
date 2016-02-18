package com.jackframe.design_patterns.bridge;

/**
 * 山越民族。产山珍，石料，矿等
 * @author wjf
 *
 */
public abstract class HighlandFarmer extends Farmer {

	protected double inefficient = 0.2;		//农业低效
	
	public abstract void delicacyFromMountain();

	public double getInefficient() {
		return inefficient;
	}

	public void setInefficient(double inefficient) {
		this.inefficient = inefficient;
	}
}
