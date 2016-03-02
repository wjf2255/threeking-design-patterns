package com.jackframe.design_patterns.caching;

/**
 * 
 * 缓存是一直避免立即释放一种需要重复使用并且获取时非常消耗计算机资源的资源。这些资源拥有唯一标识，
 * 存储在一个能够快速访问的数据结构中，并且重复利用的时候不需要再次获取以便（
 * 直接从能够快速访问的数据结构中获取获取。该数据结构存在内存中。而不需要再从数据库或则其他地方再获取一次）。
 * 这个Caching中有三种策略，每一种都有它的优点和缺点。它们分别是write-through:在一个事务中将数据写入到
 * 缓存和数据库中；write-around:忽略缓存，直接将数据写入到数据库中；write-behind:缓存队列未满的情况下
 * 写入缓存，缓存队列满了，则写入数据库中。
 *
 */
public class App {

	/**
	 * Program entry point
	 *
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {
		AppManager.initDB(false); // VirtualDB (instead of MongoDB) was used in
									// running the JUnit tests
									// and the App class to avoid Maven
									// compilation errors. Set flag to
									// true to run the tests with MongoDB
									// (provided that MongoDB is
									// installed and socket connection is open).
		AppManager.initCacheCapacity(3);
		App app = new App();
		app.useReadAndWriteThroughStrategy();
		app.useReadThroughAndWriteAroundStrategy();
		app.useReadThroughAndWriteBehindStrategy();
	}

	/**
	 * Read-through and write-through
	 */
	public void useReadAndWriteThroughStrategy() {
		System.out.println("# CachingPolicy.THROUGH");
		AppManager.initCachingPolicy(CachingPolicy.THROUGH);

		UserAccount userAccount1 = new UserAccount("001", "John",
				"He is a boy.");

		AppManager.save(userAccount1);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("001");
		AppManager.find("001");
	}

	/**
	 * Read-through and write-around
	 */
	public void useReadThroughAndWriteAroundStrategy() {
		System.out.println("# CachingPolicy.AROUND");
		AppManager.initCachingPolicy(CachingPolicy.BEFORE);

		UserAccount userAccount2 = new UserAccount("002", "Jane",
				"She is a girl.");

		AppManager.save(userAccount2);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
		System.out.println(AppManager.printCacheContent());
		userAccount2 = AppManager.find("002");
		userAccount2.setUserName("Jane G.");
		AppManager.save(userAccount2);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
	}

	/**
	 * Read-through and write-behind
	 */
	public void useReadThroughAndWriteBehindStrategy() {
		System.out.println("# CachingPolicy.BEHIND");
		AppManager.initCachingPolicy(CachingPolicy.AFTER);

		UserAccount userAccount3 = new UserAccount("003", "Adam",
				"He likes food.");
		UserAccount userAccount4 = new UserAccount("004", "Rita",
				"She hates cats.");
		UserAccount userAccount5 = new UserAccount("005", "Isaac",
				"He is allergic to mustard.");

		AppManager.save(userAccount3);
		AppManager.save(userAccount4);
		AppManager.save(userAccount5);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("003");
		System.out.println(AppManager.printCacheContent());
		UserAccount userAccount6 = new UserAccount("006", "Yasha",
				"She is an only child.");
		AppManager.save(userAccount6);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("004");
		System.out.println(AppManager.printCacheContent());
	}
}
