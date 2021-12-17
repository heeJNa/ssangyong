package sist.com.variable.basic;


public class VariableEx5 {

	public boolean actionBoolean(int x, int y, int z) {
		return x+y<z-7;
		
	}
	
	public char actionChar(int x) {
		return (char)x;
	}
	
	public static void main(String[] args) {
		VariableEx5 v = new VariableEx5();
		
		System.out.println(v.actionBoolean(4,5,8));
		System.out.println(v.actionChar(65));
	}

}
