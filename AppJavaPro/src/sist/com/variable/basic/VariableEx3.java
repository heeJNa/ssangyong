package sist.com.variable.basic;

//class�� ���赵, ����� ���� �ڷ���
public class VariableEx3 {
	
	public void byteValueMethod() {
		System.out.println(Byte.MIN_VALUE + "+" +Byte.MAX_VALUE);
	}
	
	public void shortValueMethod() {
		System.out.println(Short.MIN_VALUE + "+" +Short.MAX_VALUE);
	}
	public void integerValueMethod() {
		System.out.println(Integer.MIN_VALUE + "+" + Integer.MAX_VALUE);
	}
	public void longValueMethod() {
		System.out.println(Long.MIN_VALUE + "+" + Long.MAX_VALUE);
	}
	

	
	
	  public static void main(String[] args) {
		 VariableEx3 ex3 = new VariableEx3();
		 ex3.byteValueMethod();;
		 ex3.shortValueMethod();
		 ex3.integerValueMethod();
		 ex3.longValueMethod();
	  }
	 
}
