package sist.com.variable.core;

public class VariableAppEx2 {
	
	public int variableEx1() {
		double dValue = 25.6789;
		return (int)dValue;
	}
	
	public char variableEx2() {
		return 97;
	}
	
	public int variableEx3() {
		return 'A';
	}
	public double variableEx4(int x, int y, int z) {
		return (x+y*z)/(double)(x-y);
	}
	
	public boolean variableEx5(int x, int y, int z) {
		return ++x==y++;// 2==2      
	
	}

	public static void main(String[] args) {
		VariableAppEx2 v = new VariableAppEx2();
		int rs = v.variableEx1()+v.variableEx1();
		System.out.println(rs);
		System.out.println(v.variableEx2());
		System.out.println(v.variableEx3());
		System.out.println(v.variableEx4(5,7,6));
		System.out.println(v.variableEx5(5,5,6));
	}

}
