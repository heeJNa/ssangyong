package com.sist.lib;
//length()	 => 문자의 갯수 확인

public class MainClass5 {
	public static void main(String[] args) {
		String[] movie = { "스파이더맨: 노 웨이 홈",
							"유체이탈자",
							"돈 룩 업",
							"엔칸토: 마법의 세계",
							"연애 빠진 로맨스",
							"로그 인 벨지움",
							"티탄	",
							"나는 조선사람입니다",
							"장르만 로맨스",
							"여타짜" 
					};
		//1. 전체 목록
		for(String title: movie) {
			System.out.println(title);
		}
		System.out.println("=====================");
		//length => 갯수확인
		for(String title : movie) {
			if(title.length()>7) {
				title = title.substring(0,7)+"...";
			}
			System.out.println(title);
		}
	}
}
