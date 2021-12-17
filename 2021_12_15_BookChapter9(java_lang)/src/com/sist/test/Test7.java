package com.sist.test;

public class Test7 {
	public static void main(String[] args) {
		int i;
		int one = 0;
		int two = 0;
		for (i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				two += i;
			} else {
				one += i;
			}
		}
		System.out.println("Â¦¼öÇÕ : " + two);
		System.out.println("È¦¼öÇÕ : " + one);
	}
}
