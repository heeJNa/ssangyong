package com.sist.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
			int input = scan.nextInt();
			if (input < 0) {
				System.out.println(input + "��(��) �����Դϴ�.");
			} else if (input > 0) {
				System.out.println(input + "��(��) ����Դϴ�.");
			} else {
				System.out.println(input + "��(��) 0�Դϴ�.");
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}

}
