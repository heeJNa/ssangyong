package com.sist.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		try {
			System.out.print("정수 입력 : ");
			int input = scan.nextInt();
			if (input > 0) {
				for (int i = 1; i <= input; i++) {
					sum += i;
				}
			}else {
				for (int i = 1; i >= input; i--) {
					sum += i;
				}
			}
			System.out.println("1~" + input + "까지의 합 : " + sum);
		} catch (Exception e) {
			System.out.println("숫자를 입력하시오");
			e.printStackTrace();
		}
	}
}
