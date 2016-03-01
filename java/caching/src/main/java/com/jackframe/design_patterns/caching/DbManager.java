package com.jackframe.design_patterns.caching;

import java.text.ParseException;
import java.util.HashMap;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;

/**
 * 
 * 数据库管理
 * 
 * @author wjf
 *
 */
public class DbManager {
	
	private static MongoClient mongoClient;
	private static MongoDatabase db;
	private static boolean useMongoDB;
	private static HashMap<String, UserAccount> virtualDB;
	
	private DbManager() {}
	
	public static void createVirtualDB() {
		useMongoDB = false;
		virtualDB = new HashMap<>();
	}
	
	public static void connect() throws ParseException {
		useMongoDB = false;
		mongoClient = new MongoClient();
		db = mongoClient.getDatabase("test");
	}
	
	public static UserAccount readFromDB(String userID) {
		if(!useMongoDB) {
			if(virtualDB.containsKey(userID)) {
				virtualDB.get(userID);
			} else {
				return null;
			}
		}
		if(db == null) {
			try {
				connect();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
		FindIterable<Document> iterable = 
				db.getCollection("user_accounts").find(new Document("userID", userID));
	    if (iterable == null) {
	      return null;
	    }
	    Document doc = iterable.first();
	    UserAccount userAccount = 
	    		new UserAccount(userID, doc.getString("userName"), doc.getString("additionalInfo"));
	    return userAccount;
	}
	
	public static void writeToDB(UserAccount userAccount) {
		if(!useMongoDB) {
			virtualDB.put(userAccount.getUserID(), userAccount);
			return;
		}
		if(db == null) {
			try {
				connect();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").insertOne(new Document("userID", userAccount.getUserID())
			.append("userName", userAccount.getUserName())
			.append("additionalInfo", userAccount.getAdditionalInfo()));
	}
	
	public static void updateDB(UserAccount userAccount) {
		if(!useMongoDB) {
			virtualDB.put(userAccount.getUserID(), userAccount);
			return;
		}
		if(db == null) {
			try {
				connect();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(new Document("userID", userAccount.getUserID()), 
				new Document("$set", new Document("userName", userAccount.getUserName())
				.append("additionalInfo", userAccount.getAdditionalInfo())));
	}
	
	public static void upsertDB(UserAccount userAccount) {
		if(!useMongoDB) {
			virtualDB.put(userAccount.getUserID(), userAccount);
			return;
		}
		if(db == null) {
			try {
				connect();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(new Document("userID", userAccount.getUserID()), 
				new Document("$set", new Document("userName", userAccount.getUserName())
				.append("additionalInfo", userAccount.getAdditionalInfo())), 
				new UpdateOptions().upsert(true));
	}
}

