package com.jackframe.design_patterns.caching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * 程序缓存的数据结构或实现
 * 
 * @author wjf
 *
 */
public class LRUCache {

	class Node {
		String userID;
		UserAccount userAccount;
		Node preNode;
		Node nextNode;
		
		public Node(String userID, UserAccount userAccount) {
			this.userID = userID;
			this.userAccount = userAccount;
		}
	}
	
	int capacity;
	HashMap<String, Node> cache = new HashMap<>();
	Node head = null;
	Node end = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
	}
	
	public UserAccount getUserAccount(String userID) {
		if(cache.containsKey(userID)) {
			Node node = cache.get(userID);
			remove(node);
			setHead(node);
			return node.userAccount;
		}
		return null;
	}

	public void setHead(Node node) {
		node.nextNode = head;
		node.preNode = null;
		if(head != null ) {
			head.preNode = node;
		}
		head = node;
		if(end == null) {
			end = head;
		}
	}

	public void remove(Node node) {
		if(node.preNode != null) {
			node.preNode.nextNode = node.nextNode;
		} else {
			head = node.nextNode;
		}
		if(node.nextNode != null) {
			node.nextNode.preNode = node.preNode;
		} else {
			end = node.nextNode;
		}
	}
	
	public void set(String userID, UserAccount userAccount) {
		if(cache.containsKey(userID)) {
			Node old = cache.get(userID);
			old.userAccount = userAccount;
			remove(old);
			setHead(old);
		} else {
			Node newNode = new Node(userID, userAccount);
			if(cache.size() >= capacity) {
				System.out.println("# Cache is FULL! Removing " + end.userID + " from cache...");
				cache.remove(end.userID); // remove LRU data from cache.
		        remove(end);
		        setHead(newNode);
			} else {
				setHead(newNode);
			}
			cache.put(userID, newNode);
		}
	}
	
	public boolean contains(String userID) {
		return cache.containsKey(userID);
	}
	
	public void invalidate(String userID) {
		System.out.println("# " + userID + " has been updated! Removing older version from cache...");
		Node toBeRemoved = cache.get(userID);
		remove(toBeRemoved);
	    cache.remove(userID);
	}
	
	public boolean isFull() {
		return cache.size() >= capacity;
	}
	
	public UserAccount getLRUData() {
		return end.userAccount;
	}
	
	public void clear() {
		end = null;
		head = null;
		cache.clear();
	}
	
	public List<UserAccount> getCacheDataInListForm() {
		ArrayList<UserAccount> listOfCacheData = new ArrayList<>();
		Node temp = head;
		while(temp != null) {
			listOfCacheData.add(temp.userAccount);
			temp = temp.nextNode;
		}
		return listOfCacheData;
	}
	
	public void setCapacity(int newCapacity) {
		if(capacity > newCapacity) {
			clear();
		} else {
			capacity = newCapacity;
		}
	}
}
