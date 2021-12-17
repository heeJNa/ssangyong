package sist.com.variable.basic;

public class VariableEx4 {

	public void localValueEx1() {
		int a = 5;
		a += 1;
		System.out.println(a);
	}

	int x = 5;

	public void localValueEx2() {
		x += 5;
		System.out.println("x = " + x);

	}
	
	public void localValueEx3()	{
		int a = 10;
		
	}
	
	public void localValueEx4() {
		System.out.println((int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
		/*
		 * for(int i = (int)Character.MIN_VALUE; i <= (int)Character.MAX_VALUE ; i++ ) {
		 * 
		 * try { Thread.sleep(100); } catch (InterruptedException e) {
		 * e.printStackTrace(); } if(i%7==0) System.out.println();
		 * System.out.print((char)i +"\t"); }
		 */
	}
	
	public static void main(String[] args) {
		VariableEx4 v = new VariableEx4();
		v.localValueEx1();
		v.localValueEx2();
		System.out.println((char)65546);
		v.localValueEx4();
		System.out.println((char)65546);

	}

}
