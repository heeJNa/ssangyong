package com.sist.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int input = scan.nextInt();
		if (input >= 60) {
			System.out.println("합격");

		} else {
			System.out.println("불합격");
		}
	}
}
