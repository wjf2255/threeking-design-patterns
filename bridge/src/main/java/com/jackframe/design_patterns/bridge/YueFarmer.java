package com.jackframe.design_patterns.bridge;

public class YueFarmer extends HighlandFarmer {

	@Override
	public void delicacyFromMountain() {
		System.out.println("山越农民 生产山珍、矿石，增加城市财富收入!");
	}

	@Override
	public void product() {
		System.out.println("山越农民 主食产量:"+(this.agriculturalProductionPerYear-this.consumePerYear)*(this.consumePerYear/4)*(1-this.inefficient)+"石!");
	}

	@Override
	public void rebel() {
		System.out.println("山越农民 感觉不幸福，老百姓是会造反的！");
	}

	@Override
	public void study() {
		System.out.println("山越农民 学习会增加劳动熟练度和减少幸福感！");
	}

	@Override
	public void dead() {
		System.out.println("山越农民 年纪大了会死掉的！");
	}

}
