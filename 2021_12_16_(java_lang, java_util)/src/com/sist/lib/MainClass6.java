package com.sist.lib;
// StringTokenizer (단어별 추출) => split() => []
// => 네트워크 전송 => java.util
// => 형태소 분석 => 라이브러리 (꼬꼬마, 코모란) => 챗봇 (인공지능)
// Open Api => 카카오, 네이버클로버, 구글
import java.util.*;
public class MainClass6 {
	// <c:Tokens>
	public static void main(String[] args) {
		String names="홍길동|심청이|춘향이|김두한|강감찬|을지문덕";
		StringTokenizer st = new StringTokenizer(names, "|");
		/*
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 */
		System.out.println("이름 객수 : "+st.countTokens());
		while(st.hasMoreTokens()) {	//token 자른 갯수만큼 돌아감
			System.out.println(st.nextToken());
		}
		/*
		 * StringTokenizer st = new StringTokenizer(names, "|");
		 * 											=====  === 구분자
		 *                                           대상
		 *  st.nextToken() : 실제 자른 데이터 1개
		 *  st.countTokens() : 실제 자른 갯수
		 *  st.hasMoreTokens() : 가지고 있는 갯수 (return boolean) 다음 토큰이 없으면 false가 됨.
		 *  
		 *  ==> 날짜, 이미지
		 *  ==> null값이 있는 경우 오류발생(검색 x)
		 *  
		*/
	}
}
