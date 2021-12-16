package com.sist.test;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char hak;
		try {
			while (true) {
				System.out.print("정수 입력 : ");
				int input = scan.nextInt();
				if (input < 0 || input > 100) {
					System.out.println("0~100사이의 점수를 입력하시오");
					continue;
				}
				if (input >= 90)
					hak = 'A';
				else if (input >= 80)
					hak = 'B';
				else if (input >= 70)
					hak = 'C';
				else if (input >= 60)
					hak = 'D';
				else
					hak = 'F';
				System.out.println(hak +"학점입니다");
				break;
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력하시오");
			e.printStackTrace();
		}
	}
}
