package com.demo;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(105, "Karan");
		hashMap.put(103, "Pratick");
		hashMap.put(104, "Harsheet");
		hashMap.put(102, "Raj");
		hashMap.put(101, "Rishikesh");

		System.out.println("Before Sorting : " + hashMap);
		TreeMap<Integer, String> trreeMap = new TreeMap<Integer, String>(hashMap);
		System.out.println("After Sorting : " + trreeMap);
	}
}
