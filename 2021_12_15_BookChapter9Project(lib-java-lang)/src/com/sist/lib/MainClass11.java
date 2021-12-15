package com.sist.lib;

import java.io.FileReader;

public class MainClass11 {
	public void stringUse()	{
		String movie = "";
		long start = System.currentTimeMillis();//log파일
		//파일 읽기
		//IOException ==> CheckException
		try {
			FileReader fr = new FileReader("C:\\Users\\jim23\\eclipse-ssangyong\\ssangyong\\NewBasic\\movie.txt");
			int i = 0;
			while((fr.read())!= -1) {
				movie += String.valueOf((char)i);
			}
			fr.close();
			System.out.println(movie);
		}catch(Exception ex) {}
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : "+(end-start));
	}
	public void stringBufferUse() {
		StringBuffer sb = new StringBuffer();
		long start = System.currentTimeMillis();//log파일
		//파일 읽기
		//IOException ==> CheckException
		try {
			FileReader fr = new FileReader("C:\\Users\\jim23\\eclipse-ssangyong\\ssangyong\\NewBasic\\movie.txt");
			int i = 0;
			while((fr.read())!= -1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(sb);
		}catch(Exception ex) {}
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : "+(end-start));
	}
	
	public void stringBuilderUse() {
		StringBuilder sb = new StringBuilder();
		long start = System.currentTimeMillis();//log파일
		//파일 읽기
		//IOException ==> CheckException
		try {
			FileReader fr = new FileReader("C:\\Users\\jim23\\eclipse-ssangyong\\ssangyong\\NewBasic\\movie.txt");
			int i = 0;
			while((fr.read())!= -1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(sb);
		}catch(Exception ex) {}
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : "+(end-start));
	}
	public static void main(String[] args) {
		MainClass11 m = new MainClass11();
//		m.stringUse();
//		m.stringBufferUse();
		m.stringBuilderUse();
	}
}
