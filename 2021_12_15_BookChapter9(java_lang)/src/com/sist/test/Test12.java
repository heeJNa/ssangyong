package com.sist.test;

public class Test12 {
	public static void main(String[] args) {
		int[] num = {94,85,95,88,90};
		int max = 0;
		int min = 100;
		for(int i = 0; i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : "+ min);
	}
}
