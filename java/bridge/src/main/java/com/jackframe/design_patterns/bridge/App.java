package com.jackframe.design_patterns.bridge;

/**
 * 
 * 城市农业人口和产出
 *
 */
public class App {
	public static void main(String[] args) {
		
		HighlandCity highlandCity = new HighlandCity(new YueFarmer(), 1);
		highlandCity.delicacies();
		highlandCity.product();
		highlandCity.rebel();
		highlandCity.study();
		
		FlatlandCity flatlandCity = new FlatlandCity(new ZhongYuanFarmer(), 1);
		flatlandCity.effectionAgriculturalProduction();
		flatlandCity.product();
		flatlandCity.rebel();
		flatlandCity.study();
	}
}
