package com.sist.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("2자리수 정수 입력(10~99)>> ");
				int input = scan.nextInt();
				if (input > 10 || input < 100) {
					if (input / 10 == input % 10) {
						System.out.println("10의자리와 1의자리가 같습니다.");
						break;
					} else {
						System.out.println("10의자리와 1의자리가 다릅니다.");
						break;
					}
				} else {
					System.out.println("2자리 정수를 입력하시오");
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
