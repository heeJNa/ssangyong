package com.sist.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = scan.nextInt();
		if (input >= 60) {
			System.out.println("�հ�");

		} else {
			System.out.println("���հ�");
		}
	}
}
