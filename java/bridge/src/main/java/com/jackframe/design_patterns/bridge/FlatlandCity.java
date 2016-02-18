package com.jackframe.design_patterns.bridge;

public class FlatlandCity extends City {
	
	private int maxFarmerNumber = 1000;		//最大农业人口数量

	public FlatlandCity(Farmer farmer, int farmerNumber) {
		super(farmer, farmerNumber);
		if(this.farmerNumber > maxFarmerNumber) {
			this.farmerNumber = maxFarmerNumber;
		}
	}

	@Override
	public void product() {
		this.getFarmer().product();
	}

	@Override
	public void rebel() {
		this.getFarmer().rebel();
	}

	@Override
	public void study() {
		this.getFarmer().study();
	}

	@Override
	public FlatlandFarmer getFarmer() {
		return (FlatlandFarmer)this.farmer;
	}

	public void effectionAgriculturalProduction() {
		this.getFarmer().effectionAgriculturalProduction();
	}
}
