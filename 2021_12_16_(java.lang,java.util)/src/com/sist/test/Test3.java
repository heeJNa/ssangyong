package com.sist.test;

import java.util.Scanner;

public class Test3 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print("정수 입력 : ");
				int input = scan.nextInt();
				System.out.println("input = "+Math.abs(input));
			} catch (Exception e) {
				System.out.println("숫자를 입력하시오");
				e.printStackTrace();
			}
		}
}
