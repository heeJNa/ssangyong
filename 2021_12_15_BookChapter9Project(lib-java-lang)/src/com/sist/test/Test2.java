package com.sist.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			out: while (true) {
				System.out.println("���� �Է��ϼ���(1~12)>> ");
				int input = scan.nextInt();

				switch (input) {
				case 3, 4, 5:
					System.out.println("��");
					break out;
				case 6, 7, 8:
					System.out.println("����");
					break out;
				case 9, 10, 11:
					System.out.println("����");
					break out;
				case 1, 2, 12:
					System.out.println("�ܿ�");
					break out;
				default:
					System.out.println("�߸��Է�");
				}

				/*
				 * if (input >= 3 && input <= 5) { System.out.println("��"); break; } else if
				 * (input >= 6 && input <= 8) { System.out.println("����"); break; } else if
				 * (input >= 9 && input <= 11) { System.out.println("����"); break; } else if
				 * (input == 12 || input == 1 || input == 2) { System.out.println("�ܿ�"); break;
				 * } else { System.out.println("�߸� �Է�"); }
				 */

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
