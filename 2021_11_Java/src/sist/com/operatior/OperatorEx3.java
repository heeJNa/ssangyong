package sist.com.operatior;

public class OperatorEx3 {
	
	public int unaryOperator(int x, int y, int z, int k, int q) {
		
		return ++x + --y + z++ + --q;
	}
	
	public void unaryOperator(int x) {
		System.out.println(!(x==5));
		System.out.println(1%3);
	}
	
	public void calcOper (int x) {
		if(x != 0 && x%3==0) {
			System.out.println("3의 배수");
		}else if(x != 0 && x%5==0) {
			System.out.println("5의 배수");
		}else  if(x != 0 && x%7==0) {
			System.out.println("7의 배수");
		}else {
			System.out.println("기타 배수...");
		}
		
	}
	
	public static void main(String[] args) {
		OperatorEx3 o = new OperatorEx3();
		System.out.println(o.unaryOperator(1, 2, 3, 4, 5));
		char a ='2';
		char b ='0';
		
		int c = a - b;
		int d = 'a' - 'A';
		System.out.println(c); // 50 - 48 = 2
		System.out.println(d); //97-65 = 32
		System.out.println();
		 o.unaryOperator(5);
		System.out.println();
		o.calcOper(15);
		o.calcOper(21);
		
		int num = 11;
		System.out.println(~num);
		
		int num2 = 10;
		int num3 = 10^3;
		System.out.println(Integer.toBinaryString(num2));
		System.out.printf("%4s%n",Integer.toBinaryString(3));
		System.out.println(Integer.toBinaryString(num3));
	}
}
