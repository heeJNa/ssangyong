package com.sist.test;

import java.util.Scanner;

public class Test3 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print("���� �Է� : ");
				int input = scan.nextInt();
				System.out.println("input = "+Math.abs(input));
			} catch (Exception e) {
				System.out.println("������ �Է��Ͻÿ�");
				e.printStackTrace();
			}
		}
}
