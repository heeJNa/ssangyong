package com.sist.test;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char hak;
		try {
			while (true) {
				System.out.print("���� �Է� : ");
				int input = scan.nextInt();
				if (input < 0 || input > 100) {
					System.out.println("0~100������ ������ �Է��Ͻÿ�");
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
				System.out.println(hak +"�����Դϴ�");
				break;
			}
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}
}
