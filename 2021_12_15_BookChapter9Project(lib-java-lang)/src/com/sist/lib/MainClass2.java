package com.sist.lib;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		//1. 입력을 받는다.
		Scanner scan = new Scanner(System.in);
		System.out.println("ID와 Password 입력 : ");
		String id = scan.next();
		String pwd = scan.next();
		System.out.println("ID : "+id);
		System.out.println("Password : "+pwd);
		//2. ID,PWD를 비교한다.
		// 오라클에 저장된 데이터
		final String myId= "admin";
		final String myPwd = "1234";
		//3. 결과값 출력
		//중첩 if
		//equals ==> 대소문자를 구분해서 비교
		if(myId.equals(id)) {
			if(myPwd.equals(pwd)) {	//비밀번호 검색
					System.out.println(id+"님 로그인되었습니다.");
			}else {
				System.out.println("비밀번호가 틀립니다!!");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다!!");
		}
	}
}








