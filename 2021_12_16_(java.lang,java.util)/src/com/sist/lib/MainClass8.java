package com.sist.lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/*
 * 	java.util
 * 	날짜 관련
 * 	  Date(오라클 호환), Calendar(제어)
 *  변환 관련
 *  	날짜 변환 => SimpleDateFormat
 *  			  ChoiceFormat
 *  			  MessageFormat (SQL)
 *   데이터 수집 : Collection (11장, 12장)
 *   
 *   1장 ~ 8장 => 자바기초 (필수)
*/
public class MainClass8 {
	public static void main(String[] args) {
		// 1.오늘 날짜
		Date date = new Date(); // 시스템의 날짜 정보 (시간)
		// 2. 변환 (프로그램에 맞는 형식으로 변환)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		String today = sdf.format(date);
//		System.out.println(today);
		StringTokenizer st = new StringTokenizer(today, "-");
		String strYear = st.nextToken();
		String strMonth = st.nextToken();
		String strDay = st.nextToken();

		int year = Integer.parseInt(strYear);
		int month = Integer.parseInt(strMonth);
		int day = Integer.parseInt(strDay);

		System.out.println(strYear + "년 " + strMonth + "월");
		/*
		 * yyyy = > 4년도 2021 M => 월 1,2...11,12 / MM => 01, 02...11,12 d => 일 D =>
		 * 1월1일부터 지금까지의 일 수 hh => 시간 mm => 분 ss => 초
		 */
		System.out.println();
		// 요일 출력
		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토" };
		for (String week : strWeek) {
			System.out.print(week + "\t");
		}
		/*
		 * List list = new ArrayList() => interface Calendar c = 메소드() => 추상클래스
		 */
		// Calendar 설정
		Calendar sCal = Calendar.getInstance(); // 객체 생성
		Calendar eCal = Calendar.getInstance();
		sCal.set(Calendar.YEAR, year);
		sCal.set(Calendar.MONTH, month - 1);
		sCal.set(Calendar.DATE, 1);
		// 요일
		int week = sCal.get(Calendar.DAY_OF_WEEK); // 요일은 1~7
		// 첫번째 날짜설정
		// 입력 월이 수요일에서 시작하면 4이므로 -4+1 = -3이 나와 현재 월의 1일에서 -3해서 전 월의 말일부터 3개가 출력
		sCal.add(Calendar.DATE, -sCal.get(Calendar.DAY_OF_WEEK)+1);	
		// 마지막 날짜설정
		eCal.set(year, month - 1, sCal.getActualMaximum(Calendar.DATE));
		eCal.add(Calendar.DATE, 7 - eCal.get(Calendar.DAY_OF_WEEK));	//입력 월이 금요일에 끝나면 6이기 때문에 7-6은 1이 된다. 

		week = week - 1;
		// 달력 출력
		System.out.println("\n");
		for (int i = 1; sCal.before(eCal) || sCal.equals(eCal)
												; sCal.add(Calendar.DATE, 1)) {
			int startDay = sCal.get(Calendar.DATE);
			System.out.printf("%2d\t", startDay);
			
			if(i++%7 == 0) {
				System.out.println();
			}
		}
	}
}
