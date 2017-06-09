package com.jackframe.java_design_patterns.adapter;

import static org.mockito.Mockito.spy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.jackframe.java_design_patterns.adater.Farmer;
import com.jackframe.java_design_patterns.adater.Politician;

public class AdapterTest {

	private static final String POLITICIAN_NAME = "诸葛亮";
	private static final String FARMER_NAME = "成都居民";
	private Map<String, Object> beans;
	
	private void init() {
		beans = new HashMap<String, Object>();
		Farmer farmer = spy(new Farmer());
		beans.put(FARMER_NAME, farmer);
		
		Politician politician = new Politician((Farmer)beans.get("FARMER_NAME"));
		beans.put(POLITICIAN_NAME, politician);
	}
	
	@Test
	public void adapterTest() {
		
	}
}
