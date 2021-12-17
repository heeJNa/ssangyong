package com.sist.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			int input = scan.nextInt();
			if(input%3 == 0) {
				System.out.println(input + "는(은) 3의 배수입니다.");
			}else {
				System.out.println(input + "는(은) 3의 배수가 아입니다.");
			}
		} catch (Exception e) {
			System.out.println("정수를 입력하시오");
			e.printStackTrace();
		}
	}
}
