package com.sist.exceptions;

// Check Exception ==> 컴파일러가 감시
import java.io.*; //데이터 읽기
import java.net.*; //웹사이트 연결
//=> 예외처리를 반드시 한다

public class MainClass7 {
	public static void main(String[] args) {

		try {
			/*
			 * URLConnection(상위 클래스) | HttpURLCOnnection(하위 클래스)
			 * 
			 * HttpURLConnection conn = (HttpURLConnection)new URLCOnnection();
			 * 
			 * 동물 | 인간
			 * 
			 * 인간 a = (인간)new 동물();
			 */
			// 1. 웹사이트 연결
			URL url = new URL("https://sist.co.kr/index.jsp");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			if (conn != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				while (true) {
					String s = br.readLine();
					if (s == null)
						break;
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // 422page
		}
	}
}
