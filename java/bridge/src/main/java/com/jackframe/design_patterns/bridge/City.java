package com.jackframe.design_patterns.bridge;

public abstract class City {

	 protected Farmer farmer;
	 protected int farmerNumber = 0; //农业人口数量
	 
	 public City(Farmer farmer, int farmerNumber) {
		 this.farmer = farmer;
		 this.farmerNumber = farmerNumber;
	 }
	 
	/**
	 * 从事生产
	 */
	public abstract void product();
	
	/**
	 * 起义
	 */
	public abstract void rebel();
	
	/**
	 * 接受教育
	 */
	public abstract void study();
	
	/**
	 * 获取农民
	 * 
	 * @return 农民
	 */
	public Farmer getFarmer() {
		return farmer;
	}
}
