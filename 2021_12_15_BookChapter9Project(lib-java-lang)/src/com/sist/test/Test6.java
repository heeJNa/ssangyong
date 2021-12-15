package com.sist.test;

public class Test6 {
	public static void main(String[] args) {
		int i;
		int count =0;
		int sum =0;
		for(i =100; i<1000;i++ ) {
			if(i%4 != 0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("°¹¼ö : "+count);
		System.out.println("ÇÕ : " +sum);
	}
}
