package com.jackframe.java_design_patterns;

public interface KingdomFactory {
	
	Kingdom createKindom();

	King createKing();
	
	General createGeneral(Kingdom kindom);
	
	Politician createPolitician(Kingdom kindom);
	
	City createCity();
}
