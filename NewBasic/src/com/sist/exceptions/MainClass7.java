package com.sist.exceptions;

// Check Exception ==> �����Ϸ��� ����
import java.io.*; //������ �б�
import java.net.*; //������Ʈ ����
//=> ����ó���� �ݵ�� �Ѵ�

public class MainClass7 {
	public static void main(String[] args) {

		try {
			/*
			 * URLConnection(���� Ŭ����) | HttpURLCOnnection(���� Ŭ����)
			 * 
			 * HttpURLConnection conn = (HttpURLConnection)new URLCOnnection();
			 * 
			 * ���� | �ΰ�
			 * 
			 * �ΰ� a = (�ΰ�)new ����();
			 */
			// 1. ������Ʈ ����
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
