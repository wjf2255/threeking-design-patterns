package com.jackframe.design_patterns.bridge;

/**
 * 
 * 农民，一个国家财富的生产者
 * 
 * @author wjf
 *
 */
public abstract class Farmer {
	
	protected int agriculturalProductionPerYear = 1000; //汉代农民能耕种者耕种一千亩地，每亩年产1石粮食
	
	protected int attack = 2; //农民起义军战斗力比较差
	
	protected int agriculturalProficiency = 4; //农业熟练度
	
	protected int age = 14; //成年，能参与生产
	
	protected int consumePerYear = 200; //汉代农民每年消耗两百石粮食

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
	 * 死亡
	 */
	public abstract void dead();
}
