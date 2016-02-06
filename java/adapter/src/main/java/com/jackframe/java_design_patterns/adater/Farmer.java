package com.jackframe.java_design_patterns.adater;

/**
 * 农民
 * @author wjf
 *
 */
public class Farmer implements AgriculturalManagement {
	
	private Farmland farmland = new Farmland();

	public void increaseProduction() {
		farmland.increaseProduction();
	}

	public void agricultureOutput() {
		farmland.agricultureOutput();
	}

}
