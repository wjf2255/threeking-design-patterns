package com.jackframe.design_patterns.caching;

import java.util.List;

import com.jackframe.design_patterns.caching.DbManager;
import com.jackframe.design_patterns.caching.LRUCache;
import com.jackframe.design_patterns.caching.UserAccount;

public class CacheStore {

	static LRUCache lruCache = null;

	private CacheStore() {
	}

	public static void initCapacity(int capacity) {
		if (lruCache == null) {
			lruCache = new LRUCache(capacity);
		} else {
			lruCache.setCapacity(capacity);
		}
	}

	public static UserAccount readThrough(String userID) {
		if (lruCache.contains(userID)) {
			System.out.println("# Cache Hit!");
			return lruCache.getUserAccount(userID);
		}
		System.out.println("# Cache Miss!");
		UserAccount userAccount = DbManager.readFromDB(userID);
		lruCache.set(userID, userAccount);
		return userAccount;
	}

	public static void writeThrough(UserAccount userAccount) {
		if (lruCache.contains(userAccount.getUserID())) {
			DbManager.updateDB(userAccount);
		} else {
			DbManager.writeToDB(userAccount);
		}
	}

	public static void writeAround(UserAccount userAccount) {
		if (lruCache.contains(userAccount.getUserID())) {
			DbManager.updateDB(userAccount);
			lruCache.invalidate(userAccount.getUserID()); // Cache data has been
															// updated -- remove
															// older
															// version from
															// cache.
		} else {
			DbManager.writeToDB(userAccount);
		}
	}

	public static UserAccount readThroughWithWriteBackPolicy(String userID) {
		if (lruCache.contains(userID)) {
			System.out.println("# Cache Hit!");
			return lruCache.getUserAccount(userID);
		}
		System.out.println("# Cache Miss!");
		UserAccount userAccount = DbManager.readFromDB(userID);
		if (lruCache.isFull()) {
			System.out.println("# Cache is FULL! Writing LRU data to DB...");
			UserAccount toBeWrittenToDb = lruCache.getLRUData();
			DbManager.upsertDB(toBeWrittenToDb);
		}
		lruCache.set(userID, userAccount);
		return userAccount;
	}

	public static void WriteBehind(UserAccount userAccount) {
		if (!lruCache.contains(userAccount.getUserID()) && lruCache.isFull()) {
			System.out.println("# Cache is FULL! Writing LRU data to DB...");
			UserAccount toBeWrittenToDB = lruCache.getLRUData();
			DbManager.upsertDB(toBeWrittenToDB);
		}
		lruCache.set(userAccount.getUserID(), userAccount);
	}

	public static void clearCache() {
		if (lruCache != null) {
			lruCache.clear();
		}
	}

	public static void flushCache() {
		System.out.println("# flushCache...");
		if (lruCache == null) {
			return;
		}
		List<UserAccount> listOfUserAccounts = lruCache
				.getCacheDataInListForm();
		for (UserAccount userAccount : listOfUserAccounts) {
			DbManager.upsertDB(userAccount);
		}
	}

	public static String print() {
		List<UserAccount> listOfUserAccounts = lruCache
				.getCacheDataInListForm();
		StringBuilder sb = new StringBuilder();
		sb.append("\n--CACHE CONTENT--\n");
		for (UserAccount userAccount : listOfUserAccounts) {
			sb.append(userAccount.toString() + "\n");
		}
		sb.append("----\n");
		return sb.toString();
	}
}
