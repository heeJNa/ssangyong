package com.sist.test;

public class Test5 {
	public static void main(String[] args) {
		int i;
		int count =0;
		int sum =0;
		for(i =100; i<1000;i++ ) {
			if(i%7 == 0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("7�� ��� ���� : "+count);
		System.out.println("7�� ��� �� : " +sum);
	}
}
