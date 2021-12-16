package com.sist.lib;

import java.util.Random;
import java.util.Scanner;

public class MainClass4 {
	public static void main(String[] args) {
		//1. 임의의 수 저장 => 난수 => Random ==>1~100
		Random r = new Random();
		int com = r.nextInt(100)+1; //0~99 => 1~100
		int count =0;
		System.out.println("UPDOWN 게임을 시작합니다");
		
		Scanner scan = new Scanner(System.in);
		while(true) {	//반복횟수를 모르는 경우 => 무한루프
			//사용자 입력
			System.out.print("1~100 사이의 정수 입력 : ");
			int user = scan.nextInt();
			//1~100이 아닌 경우
			if(user<1 || user >100) {
				System.out.println("잘못된 입력입니다.");
				continue;
				/*
				 * while ==> 조건식으로 이동
				 * for ==> 증가식으로 이동
				*/
			}
			count++;
			//힌트
			if(com>user) {
				System.out.println("UP");
			}else if(com <user) {
				System.out.println("DOWN");
			}else {
				System.out.println("정답입니다.");
				System.out.println("점수 : "+count);
				break;
			}
			//정답 여부 => 종료
		}
	}
}
