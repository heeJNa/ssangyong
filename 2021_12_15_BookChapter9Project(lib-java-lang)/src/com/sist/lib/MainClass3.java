
package com.sist.lib;

public class MainClass3 {
	public static void main(String[] args) {
		String s = "Hello Java!!";
		int i = s.indexOf('a');
		System.out.println("i ="+i);
		int j = s.lastIndexOf('a');
		System.out.println("j = "+j);
		
		s= "C:\\Users\\jim23\\eclipse-ssangyong";
		int k = s.lastIndexOf("\\");	// \\는 1개 취급 "" 안에서
		System.out.println(k);
		String ss = s.substring(s.lastIndexOf("\\")+1);
		System.out.println(ss);
	}
}
