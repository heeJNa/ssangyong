package com.sist.test;

import java.util.Scanner;

public class Test6 {
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
				
				switch(input/10) {
				case 9,10: 
					hak ='A';
					break;
				case 8: 
					hak ='B';
					break;
				case 7: 
					hak ='C';
					break;
				case 6: 
					hak ='D';
					break;
				default:
						hak='F';
				}
				System.out.println(hak +"�����Դϴ�");
				break;
			}
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}
}
