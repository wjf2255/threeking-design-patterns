package com.jackframe.design_patterns.caching;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app;

	  /**
	   * Setup of application test includes: initializing DB connection and cache size/capacity.
	   */
	  @Before
	  public void setUp() {
	    AppManager.initDB(false); // VirtualDB (instead of MongoDB) was used in running the JUnit tests
	                              // to avoid Maven compilation errors. Set flag to true to run the
	                              // tests with MongoDB (provided that MongoDB is installed and socket
	                              // connection is open).
	    AppManager.initCacheCapacity(3);
	    app = new App();
	  }

	  @Test
	  public void testReadAndWriteThroughStrategy() {
	    app.useReadAndWriteThroughStrategy();
	  }

	  @Test
	  public void testReadThroughAndWriteAroundStrategy() {
	    app.useReadThroughAndWriteAroundStrategy();
	  }

	  @Test
	  public void testReadThroughAndWriteBehindStrategy() {
	    app.useReadThroughAndWriteBehindStrategy();
	  }
	  
	  @Test
	  public void testYIHUO() {
		  System.out.println(Integer.toBinaryString(-5));
		  System.out.println(Integer.toBinaryString(-3));
		  System.out.println(-5 ^ -3);
		  System.out.println(Integer.toBinaryString(6));
		  System.out.println("------------");
		  System.out.println(Integer.toBinaryString(5));
		  System.out.println(Integer.toBinaryString(3));
		  System.out.println(5 ^ 3);
		  System.out.println(Integer.toBinaryString(6));
		  System.out.println("------------");
		  System.out.println(Integer.toBinaryString(-5));
		  System.out.println(Integer.toBinaryString(3));
		  System.out.println(-5 ^ 3);
		  System.out.println(Integer.toBinaryString(-8));
		  System.out.println("11111111111111111111111111111011");
		  System.out.println("00000000000000000000000000000011");
		  System.out.println("11111111111111111111111111111000");
		  
		  System.out.println("00000000000000000000000000001000");
		  System.out.println("11111111111111111111111111110111");
	  }
}
