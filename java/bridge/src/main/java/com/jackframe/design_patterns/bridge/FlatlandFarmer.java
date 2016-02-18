package com.jackframe.design_patterns.bridge;

/**
 * 
 * 平坦土地上的农民
 * 
 * @author wjf
 *
 */
public abstract class FlatlandFarmer extends Farmer {

	protected double inefficient = -0.1; //平坦城市农业加成
	/**
	 * 平坦土地，农业产出加成
	 */
	public abstract void effectionAgriculturalProduction();
}
