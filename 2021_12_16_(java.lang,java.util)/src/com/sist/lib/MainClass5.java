package com.sist.lib;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass5 {
	public static void main(String[] args) {
		int[] com = new int[3];
		boolean bCheck = false; // �ߺ����� Ȯ��
		int count = 0;
		// �ߺ��� ������ �ٽ� ���� �߻�
		Random r = new Random();
		int su = 0;

		for (int i = 0; i < com.length; i++) {
			bCheck = true;
			while (bCheck) {
				// ���� �߻�
				su = r.nextInt(9) + 1;
				bCheck = false;
				for (int j = 0; j < i; j++) {
					if (com[j] == su) { // �ߺ��� �ֳ�?
						bCheck = true; // �ߺ��� �ִٸ�
						break; // while�� �ٽ� ����
					}
				}
			}
			// �ߺ����� ������ �߻�
			com[i] = su;
		}
//		System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);

		while (true) {
			// ����� �Է�
			System.out.println("3�ڸ� ���� �Է� : ");
			int input = scan.nextInt();
			// ����ó��
			if (input < 100 || input > 999) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue; // whileó������ ���ư���.
			}
			// �迭�� ���� ==> 345
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			// �ߺ��� ���� �Է��ϸ� �ȵȴ�.
			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0�� ��� �� �� �����ϴ�!!");
				continue;
			}
			count++;
			// ��Ʈ
			int s = 0; // �ڸ���
			int b = 0; // ����
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			if(s==3) {
				System.out.println("Score : " + count + "\nGame Over");
				break;
			}else {
				System.out.println("Input Number : " + input +",Result : "+s+"S "+b+"B");
			}
		}
	}
}
