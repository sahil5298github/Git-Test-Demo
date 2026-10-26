package com.demo;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(50, "Karan");
		hashMap.put(40, "Shubham");
		hashMap.put(10, "Harshit");
		hashMap.put(30, "Pankaj");
		hashMap.put(20, "Abhijit");

		System.out.println("Before Sorting : " + hashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
		System.out.println("After Sorting : " + treeMap);
	}
}
