package com.jackframe.design_patterns.bridge;

/**
 * 
 * 平坦土地上的农民
 * 
 * @author wjf
 *
 */
public abstract class FlatlandFarmer extends Farmer {

	public FlatlandFarmer() {
		inefficient = -0.1;
	}
	/**
	 * 平坦土地，农业产出加成
	 */
	public abstract void effectionAgriculturalProduction();
}
