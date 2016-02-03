package com.jackframe.java_design_patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jackframe.java_design_patterns.shu.LiuBeiKing;
import com.jackframe.java_design_patterns.wei.CaocaoKing;
import com.jackframe.java_design_patterns.wu.SunQuanKing;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	KingdomFactory shuKingdomFactory;
	KingdomFactory wuKingdomFactory;
	KingdomFactory weiKingdomFactory;
	
	App app = new App();
	
	@Before
	public void init() {
		shuKingdomFactory = app.getShuKingdomFactory();
		wuKingdomFactory = app.getWuKingdomFactory();
		weiKingdomFactory = app.getWeiKingdomFactory();
	}
	
	@Test
	public void testKing() {
		final King liuBeiKing = shuKingdomFactory.createKing();
		assertTrue(liuBeiKing instanceof LiuBeiKing);
		assertEquals(LiuBeiKing.NAME, liuBeiKing.getName());
		final King caoCaoKing = weiKingdomFactory.createKing();
		assertTrue(caoCaoKing instanceof CaocaoKing);
		assertEquals(CaocaoKing.NAME, caoCaoKing.getName());
		final King sunQuanKing = wuKingdomFactory.createKing();
		assertTrue(sunQuanKing instanceof SunQuanKing);
		assertEquals(SunQuanKing.NAME, sunQuanKing.getName());
	}
}
