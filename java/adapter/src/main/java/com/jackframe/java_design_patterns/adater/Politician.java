package com.jackframe.java_design_patterns.adater;

/**
 * 政治家
 * @author wjf
 *
 */
public class Politician implements AgriculturalManagement {
	
	private Farmer farmer;
	
	public Politician(Farmer farmer) {
		this.farmer = farmer;
	}

	public void increaseProduction() {
		farmer.increaseProduction();
	}

	public void agricultureOutput() {
		farmer.agricultureOutput();
	}

}
