package com.jackframe.java_design_patterns.adater;

public class Farmland {
	
	private int capacity = 100;
	
	public void increaseProduction() {
		capacity += 20;
		System.out.println("增加20万担");
	}

	public void agricultureOutput() {
		System.out.println("产出粮食"+capacity+"万担");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
