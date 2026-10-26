package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(103);
		set.add(105);
		set.add(101);
		set.add(106);
		set.add(102);
		set.add(104);

		System.out.println("Before Reverse Order : " + set);

		List<Integer> alist = new ArrayList<Integer>(set);
		Collections.sort(alist, Collections.reverseOrder());

		System.out.println("Before Reverse Order : " + alist);
	}
}
