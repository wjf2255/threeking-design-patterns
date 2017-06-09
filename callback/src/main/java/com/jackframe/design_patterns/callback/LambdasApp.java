package com.jackframe.design_patterns.callback;

public class LambdasApp {

	/**
	 * Program entry point
	 */
	public static void main(String[] args) {
	    Task task = new SimpleTask();
	    Callback c = () -> System.out.println("I'm done now.");
	    task.executeWith(c);
	  }
}
