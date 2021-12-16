package com.sist.test;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		try {
			while (true) {
				System.out.print("ù��° ���� �Է� : ");
				int input1 = scan.nextInt();
				System.out.print("+,-,*,/ �Է� : ");
				String c = scan.next();
				if(c != "+" || c != "-" || c != "*" || c != "/") {
					System.out.println("+,-,*,/ �߿� �Է��Ͻÿ�");
					continue;
				}
				System.out.print("�ι�° ���� �Է� : ");
				int input2 = scan.nextInt();
				
				switch(c) {
				case "+": 
					sum = input1+input2;
					break;
				case "-": 
					sum = input1-input2;
					break;
				case "*": 
					sum = input1*input2;
					break;
				case "/": 
					sum = input1/input2;
				}
				System.out.println(input1 +c+input2 + "=" + sum);
				break;
			}
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("������ �Է��Ͻÿ�");
			e.printStackTrace();
		}
	}
}
