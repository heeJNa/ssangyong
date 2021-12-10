package sist.com.operatior;

public class OperatiorEX2 {

	public int unaryOperator(int x) { //단항 연산자
		return !(x>10)?-x:x;
	}
	
	public void unaryOperator(String s, int y) {
		System.out.println("unaryOperator(String s, int y)");
		int rs = s.equals("Action")?++y:y++;
		System.out.println("rs = " + rs++);
		System.out.println("rs = " + ++rs);
		
	}
	
	public boolean unaryOperator(int x,int y,int z,int k) {
	      return ((!(!!!(x<y)&& z++==3)||(x+y)<z)?"Java":"Oracle").equals("Java");
	   }   

	
	public static void main(String[] args) {
		OperatiorEX2 o = new OperatiorEX2();
		System.out.println(o.unaryOperator(10));
		System.out.println();
		o.unaryOperator("Action", 10);
		System.out.println();
		
		int i =5;
		int j = i++ - ++i;
		int y =5;
		int x = y++ - 5;
				
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		
		System.out.println();
		
		System.out.println(o.unaryOperator(1, 2, 3, 4));

	}

}
