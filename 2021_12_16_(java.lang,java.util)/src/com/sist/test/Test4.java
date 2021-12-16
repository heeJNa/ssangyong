package com.sist.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			int input = scan.nextInt();
			if(input<0) {
				input = Math.abs(input);
			}
			if(input%4 ==0 && input%100 != 0 || input %400 ==0) {
				System.out.println(input+"년도는 윤년입니다.");
			}else {
				System.out.println(input+"년도는 윤년이 아닙니다.");
			}
		} catch (Exception e) {
			System.out.println("정수를 입력하시오");
			e.printStackTrace();
		}
	}

}
