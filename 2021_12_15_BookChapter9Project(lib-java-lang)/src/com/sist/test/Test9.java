package com.sist.test;

public class Test9 {
	public static void main(String[] args) {
		int i;
		int sum1 = 0;
		int sum2 = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 7 == 0) {
				sum1 += i;
			}
			if (i % 9 == 0) {
				sum2 += i;
			}
		}
		System.out.println("7�� ��� : " + sum1);
		System.out.println("9�� ��� : " + sum2);
		System.out.printf("7�� ��� + 9�� ��� : %d", sum1 + sum2);
	}
}
