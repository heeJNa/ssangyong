package com.sist.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("2�ڸ��� ���� �Է�(10~99)>> ");
				int input = scan.nextInt();
				if (input > 10 || input < 100) {
					if (input / 10 == input % 10) {
						System.out.println("10���ڸ��� 1���ڸ��� �����ϴ�.");
						break;
					} else {
						System.out.println("10���ڸ��� 1���ڸ��� �ٸ��ϴ�.");
						break;
					}
				} else {
					System.out.println("2�ڸ� ������ �Է��Ͻÿ�");
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
