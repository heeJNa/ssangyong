package com.sist.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
			int input = scan.nextInt();
			if(input<0) {
				input = Math.abs(input);
			}
			if(input%4 ==0 && input%100 != 0 || input %400 ==0) {
				System.out.println(input+"�⵵�� �����Դϴ�.");
			}else {
				System.out.println(input+"�⵵�� ������ �ƴմϴ�.");
			}
		} catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}

}
