package com.sist.test;

import java.util.Random;

public class Test13 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		for(int i = 0; i<num.length;i++) {
			int k  = (int)(Math.random()*10)+1;
			num[i] = k;
			sum += num[i];
		}
		System.out.println("·£´ıÇÑ Á¤¼öµé : ");
		for(int i : num) {
			System.out.print(i+" ");
		}
		System.out.println("\nÆò±ÕÀº " +sum/(double)num.length);
	}
}
