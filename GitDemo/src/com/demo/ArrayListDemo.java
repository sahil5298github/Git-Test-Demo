package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(100);
		alist.add(1002);
		alist.add(104);
		alist.add(103);
		alist.add(101);

		System.out.println("Before Sorting : " + alist);
		Collections.sort(alist);
		System.out.println("After Sorting : " + alist);
	}
}
