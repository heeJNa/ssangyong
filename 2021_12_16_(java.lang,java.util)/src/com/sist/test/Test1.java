package com.sist.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			int input = scan.nextInt();
			if (input < 0) {
				System.out.println(input + "는(은) 음수입니다.");
			} else if (input > 0) {
				System.out.println(input + "는(은) 양수입니다.");
			} else {
				System.out.println(input + "는(은) 0입니다.");
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력하시오");
			e.printStackTrace();
		}
	}

}
