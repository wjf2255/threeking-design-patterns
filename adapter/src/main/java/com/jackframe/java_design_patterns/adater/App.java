package com.jackframe.java_design_patterns.adater;

public class App {

	public static void main(String[] args) {
		Politician politician = new Politician(new Farmer());
		politician.increaseProduction();
		politician.agricultureOutput();
	}
	
	
}
