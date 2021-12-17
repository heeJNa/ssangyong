package sist.com.operatior;

public class OperatorEx1 {
	
	public int firstOperator(int x, int y, int z) {
//		return x>y?(x+y*z):((x+y)*z);
		return x>y?(x+y*z):y<z?((x-y)*z):((x+y)*z);
	}
	
	public int firstOperator(int x, int y, int z, int k) {
		return x>y || z<k? x+y*z :(x+y)*z;
	}
	
	public static void main(String[] args) {
		OperatorEx1 o = new OperatorEx1(); //HEAP
		int rs = o.firstOperator(5,6,7);
		int rf = o.firstOperator(1, 2, 3, 4);
		System.out.printf("firstOperator Result = %d%n",rs);
		System.out.println(rf);
		int f =100;
		float i = f;
		System.out.println(i);
		
		float z = i+f;
		
		byte b = 10;
		short s = 10;
		int k = b+s;
		System.out.println(k);
		float m = i/k;
	}
}
