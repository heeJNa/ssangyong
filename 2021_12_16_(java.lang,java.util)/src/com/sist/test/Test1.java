package com.sist.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
			int input = scan.nextInt();
			/*
			 * if (input < 0) { System.out.println(input + "��(��) �����Դϴ�."); } else if (input
			 * > 0) { System.out.println(input + "��(��) ����Դϴ�."); } else {
			 * System.out.println(input + "��(��) 0�Դϴ�."); }
			 */
			System.out.println(input>0?input+"��(��) ����Դϴ�.":input==0?input+"��(��) 0�Դϴ�.":input+"��(��) �����Դϴ�.");
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}

}
