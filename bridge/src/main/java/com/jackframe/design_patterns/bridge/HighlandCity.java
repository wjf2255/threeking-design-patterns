package com.jackframe.design_patterns.bridge;

/**
 * 
 * 山地城市，农业效率低，但是生产矿石、山珍野味
 * 
 * @author wjf
 *
 */
public class HighlandCity extends City {

	public HighlandCity(HighlandFarmer farmer, int farmerNumber) {
		super(farmer, farmerNumber);
		maxFarmerNumber = 100;
		if(this.farmerNumber > maxFarmerNumber) {
			this.farmerNumber = maxFarmerNumber;
		}
	}

	/**
	 * 山地城市，产野味
	 */
	public void delicacies() {
		this.getFarmer().delicacyFromMountain();
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
	public HighlandFarmer getFarmer() {
		return (HighlandFarmer)this.farmer;
	}
}
