package com.sist.test;

public class Test8 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}