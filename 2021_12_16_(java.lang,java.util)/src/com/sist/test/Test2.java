package com.sist.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
			int input = scan.nextInt();
			if(input%3 == 0) {
				System.out.println(input + "��(��) 3�� ����Դϴ�.");
			}else {
				System.out.println(input + "��(��) 3�� ����� ���Դϴ�.");
			}
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}
}
