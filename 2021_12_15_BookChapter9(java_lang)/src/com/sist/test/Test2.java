package com.sist.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			out: while (true) {
				System.out.println("달을 입력하세요(1~12)>> ");
				int input = scan.nextInt();

				switch (input) {
				case 3, 4, 5:
					System.out.println("봄");
					break out;
				case 6, 7, 8:
					System.out.println("여름");
					break out;
				case 9, 10, 11:
					System.out.println("가을");
					break out;
				case 1, 2, 12:
					System.out.println("겨울");
					break out;
				default:
					System.out.println("잘못입력");
				}

				/*
				 * if (input >= 3 && input <= 5) { System.out.println("봄"); break; } else if
				 * (input >= 6 && input <= 8) { System.out.println("여름"); break; } else if
				 * (input >= 9 && input <= 11) { System.out.println("가을"); break; } else if
				 * (input == 12 || input == 1 || input == 2) { System.out.println("겨울"); break;
				 * } else { System.out.println("잘못 입력"); }
				 */

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
