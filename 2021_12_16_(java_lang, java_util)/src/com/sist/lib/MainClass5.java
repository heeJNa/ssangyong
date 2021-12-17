package com.sist.lib;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass5 {
	public static void main(String[] args) {
		int[] com = new int[3];
		boolean bCheck = false; // 중복여부 확인
		int count = 0;
		// 중복이 있으면 다시 난수 발생
		Random r = new Random();
		int su = 0;

		for (int i = 0; i < com.length; i++) {
			bCheck = true;
			while (bCheck) {
				// 난수 발생
				su = r.nextInt(9) + 1;
				bCheck = false;
				for (int j = 0; j < i; j++) {
					if (com[j] == su) { // 중복이 있냐?
						bCheck = true; // 중복이 있다면
						break; // while을 다시 수행
					}
				}
			}
			// 중복없는 정수가 발생
			com[i] = su;
		}
//		System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);

		while (true) {
			// 사용자 입력
			System.out.println("3자리 정수 입력 : ");
			int input = scan.nextInt();
			// 오류처리
			if (input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다.");
				continue; // while처음으로 돌아간다.
			}
			// 배열에 저장 ==> 345
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			// 중복된 수를 입력하면 안된다.
			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0을 사용 할 수 없습니다!!");
				continue;
			}
			count++;
			// 힌트
			int s = 0; // 자리수
			int b = 0; // 숫자
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			if(s==3) {
				System.out.println("Score : " + count + "\nGame Over");
				break;
			}else {
				System.out.println("Input Number : " + input +",Result : "+s+"S "+b+"B");
			}
		}
	}
}
