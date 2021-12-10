package sist.com.variable.core;

public class VariableAppEx1 {
	
	public void byteMethod() {
		byte byteValue1 = (Byte.MAX_VALUE+1)>Byte.MAX_VALUE?Byte.MAX_VALUE:0;
		System.out.println(byteValue1);
		//byte byteValue2 = Byte.MAX_VALUE+100;
		System.out.println(Byte.MAX_VALUE+100);
	}
	
	public double byteMethod1() {
		byte byteValue =100;
		return byteValue;
	}
	
	public void intMethod(int v1) {
		int v2 = Integer.MAX_VALUE;	//2147483647
		long rs = v1 + (long)v2;	//큰바이트에서 연산하게 되어있음.		
		System.out.println(rs);
		
	}
	public short shortMethod() {
		short sValue1 = 120;
		short sValue2 = 520;
		return (short)(sValue1 + sValue2);
	}
	
	public double doubleMethod() {
		return 100/(double)3;	//.을 붙여줘야함
	}
	
	public void binaryMethod() {
		int v1 =015;
		int v2 = 0x45;
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		
	}
	public void formatPrint() {
		
		System.out.printf("오늘은%d일 입니다%n",15);
		System.out.printf("오늘은%#o일 입니다%n",15);
		System.out.printf("오늘은%#x일 입니다%n",31);
		System.out.printf("오늘은%d일 입니다%n",15);
		System.out.printf("%s","오늘은 15일 입니다.");
		System.out.printf("%b%n",5>3);
		System.out.printf("c는 정수=%d 이고 문자는 %c이다.%n",65,65);
		System.out.printf("오늘은[%5d]일 입니다%n",15);		//오늘은[   15]일 입니다
		System.out.printf("오늘은[%-5d]일 입니다%n",15);		//오늘은[15   ]일 입니다
		float f1 = .10f; //0.10, 1.0e-1
		System.out.printf("%f, %e%n",f1, f1);
		double d = 1.2345679;
		System.out.printf("%14.10f%n",d); //14자리 중에 소수점 10자리 나머지 자리는 공백으로 앞에 나옴.
		System.out.printf("%20s%n","안녕하십니까");
		System.out.printf("%.3s%n","안녕하십니까");	//왼쪽에서 3글자만 출력
	}
	
	
	
	public static void main(String[] args) {
		VariableAppEx1 v = new VariableAppEx1();
		v.byteMethod();
		double d = v.byteMethod1();
		System.out.println(d);
		v.intMethod(1);
		System.out.println(v.shortMethod());
		System.out.println(v.doubleMethod());
		v.binaryMethod();
		v.formatPrint();
		
		
		
	}
}
