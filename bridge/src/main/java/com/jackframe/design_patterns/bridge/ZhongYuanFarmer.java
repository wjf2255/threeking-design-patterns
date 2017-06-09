package com.jackframe.design_patterns.bridge;

public class ZhongYuanFarmer extends FlatlandFarmer {

	@Override
	public void effectionAgriculturalProduction() {
		System.out.println("中原农民 地势平坦，农业产出加成！");

	}

	@Override
	public void product() {
		System.out.println("中原农民 主食产量:"+(this.agriculturalProductionPerYear-this.consumePerYear)*(this.consumePerYear/4)*(1-this.inefficient)+"石!");
	}

	@Override
	public void rebel() {
		System.out.println("中原农民 感觉不幸福，老百姓是会造反的！");
	}

	@Override
	public void study() {
		System.out.println("中原农民 学习会增加劳动熟练度和减少幸福感！");
	}

	@Override
	public void dead() {
		System.out.println("中原农民 年纪大了会死掉的！");
	}
}
