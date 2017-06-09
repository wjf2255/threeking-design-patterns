package com.jackframe.design_patterns.caching;

import java.text.ParseException;

public class AppManager {

	private static CachingPolicy cachingPolicy;

	private AppManager() {
	}

	public static void initDB(boolean userMongoDB) {
		if (userMongoDB) {
			try {
				DbManager.connect();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			DbManager.createVirtualDB();
		}
	}

	public static void initCachingPolicy(CachingPolicy policy) {
		cachingPolicy = policy;
		if (cachingPolicy == CachingPolicy.AFTER) {
			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
				@Override
				public void run() {
					CacheStore.flushCache();
				}
			}));
		}
		CacheStore.clearCache();
	}

	public static void initCacheCapacity(int capacity) {
		CacheStore.initCapacity(capacity);
	}

	public static UserAccount find(String userId) {
		if (cachingPolicy == CachingPolicy.THROUGH
				|| cachingPolicy == CachingPolicy.BEFORE) {
			return CacheStore.readThrough(userId);
		} else if (cachingPolicy == CachingPolicy.AFTER) {
			return CacheStore.readThroughWithWriteBackPolicy(userId);
		}
		return null;
	}

	public static void save(UserAccount userAccount) {
		if (cachingPolicy == CachingPolicy.THROUGH) {
			CacheStore.writeThrough(userAccount);
		} else if (cachingPolicy == CachingPolicy.BEFORE) {
			CacheStore.writeAround(userAccount);
		} else if (cachingPolicy == CachingPolicy.AFTER) {
			CacheStore.WriteBehind(userAccount);
		}
	}

	public static String printCacheContent() {
		return CacheStore.print();
	}
}
