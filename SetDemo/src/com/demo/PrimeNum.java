package com.demo;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = s.nextInt();
		int temp = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 1) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}
}
