package sist.com.variable.basic;

//Ŭ���� (���赵, ����� ���� �ڷ���)
//���� : DATA�� ��� ����
//DATA �⺻��|������
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
