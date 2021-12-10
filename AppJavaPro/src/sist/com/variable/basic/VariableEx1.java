package sist.com.variable.basic;

//클래스 (설계도, 사용자 정의 자료형)
//변수 : DATA를 담는 공간
//DATA 기본형|참조형
public class VariableEx1 {
	
	public static void main(String[] args) {
		/*
		 * boolean booleanvalue = 50<90; booleanvalue = 5==3;
		 * System.out.println("booleanValue = " + booleanvalue);
		 */
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2147483647;
		
		System.out.println(Byte.MIN_VALUE + "+" +Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "+" +Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "+" +Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "+" +Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE + "+" +Byte.MAX_VALUE);
		System.out.println(Character.MIN_VALUE + "+" +Character.MAX_VALUE);
		
		char charValue = 'A';
		String str = "ABC";
	}
	
	
}
