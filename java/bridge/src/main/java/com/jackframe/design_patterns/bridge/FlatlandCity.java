package com.jackframe.design_patterns.bridge;

public class FlatlandCity extends City {
	
	public FlatlandCity(Farmer farmer, int farmerNumber) {
		super(farmer, farmerNumber);
		maxFarmerNumber = 1000;
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
