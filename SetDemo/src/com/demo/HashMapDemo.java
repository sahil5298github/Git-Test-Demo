package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new LinkedHashMap<>();
		hmap.put(102, "Sahil");
		hmap.put(101, "Pratik");
		hmap.put(106, "Harsh");
		hmap.put(104, "Rahul");
		hmap.put(105, "Karan");
		hmap.put(103, "Manao");

		System.out.println("Before Sorting : " + hmap);
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting : "+treeMap);
	}	
}
