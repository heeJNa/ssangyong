package sist.com.variable.core;

public class VariableAppEx3 {
	
	public void castMethod1() {
		char c = 99;
		System.out.println(c);
		
		String str="120";
		int i = Integer.parseInt(str);
		System.out.println(i+5);
	}
	
	public void castMethod2() {
		int i = 200;
		byte b =(i>=Byte.MIN_VALUE&&i<=Byte.MAX_VALUE)?(byte)i:0;

		System.out.println(b);
	}
	
	 public void binaryMethod(int value) {
	      //System.out.println(Integer.to);
	      String b=Integer.toBinaryString(value);
	      String ot=Integer.toOctalString(value);
	      String hx=Integer.toHexString(value);
	      
	      System.out.println(b+" "+ot+" "+hx);
	      
	      System.out.println("2진수"+ b+" :"+ Integer.valueOf(b, 2));
	      System.out.println("8진수"+ ot+" :"+ Integer.valueOf(ot, 8));
	      System.out.println("16진수"+ hx+" :"+ Integer.valueOf(hx, 16));
	   }


	public static void main(String[] args) {
		VariableAppEx3 v = new VariableAppEx3();
		v.castMethod1();
		v.castMethod2();
		System.out.println();
		v.binaryMethod(15);
	}

}
