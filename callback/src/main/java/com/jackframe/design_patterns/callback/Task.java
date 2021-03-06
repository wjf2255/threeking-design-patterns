package com.jackframe.design_patterns.callback;

public abstract class Task {

	public final void executeWith(Callback callback) {
		execute();
		if(callback != null) {
			callback.call();
		}
	}
	
	public abstract void execute();
}
