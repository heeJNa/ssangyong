package com.sist.test;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		try {
			while (true) {
				System.out.print("첫번째 정수 입력 : ");
				int input1 = scan.nextInt();
				System.out.print("+,-,*,/ 입력 : ");
				String c = scan.next();
				if(c != "+" || c != "-" || c != "*" || c != "/") {
					System.out.println("+,-,*,/ 중에 입력하시오");
					continue;
				}
				System.out.print("두번째 정수 입력 : ");
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
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("숫자를 입력하시오");
			e.printStackTrace();
		}
	}
}
