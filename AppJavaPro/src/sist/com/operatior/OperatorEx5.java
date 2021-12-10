package sist.com.operatior;

public class OperatorEx5 {

	public boolean yunDal(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public void logicOperator(int year) {
		if (yunDal(year)) {
			System.out.println("À±´Þ");
		} else
			System.out.println("Æò´Þ");
	}

	public boolean logicOperator(int x, int y, int z, int k) {

		//boolean state = ++x == 1 && --y == 1 || ++z == 4;
		//System.out.println("x=" + x + " y=" + y + " z=" + z); // 2 2 4

		//boolean state2 = x++ == 1 && --y == 1 || ++z == 4;
		//System.out.println("x=" + x + " y=" + y + " z=" + z); // 2 1 3

		boolean state3 = ++x == 1 && (--y == 1 || ++z == 4);
	    System.out.println("x=" + x + " y=" + y + " z=" + z); // 2 2 3
		
		return state3;
	}
	
	public void samHang(int x, int y, int z, int k) {
		System.out.println (x++==++y?(z--<++k?"A":"B"):(x+y)<(z-k)?"C":"D");	//D
		System.out.println (++x==y?(z-->++k?"A":"B"):(x+y)<(z-k)?"C":"D");		//B
	
		System.out.println("x = "+ x + "\ty = "+ y + "\tz = "+ z + "\tk = "+ k );
	}

	public static void main(String[] args) {
		OperatorEx5 o = new OperatorEx5();
		//o.logicOperator(400);
		//System.out.println(o.logicOperator(1, 2, 3, 4));
		o.samHang(1, 2, 3, 4);
		int x =1;
		int y =2;
		int z =3;
		int k =4;
		//x=+1;
		//System.out.println(x);
		
		System.out.println(10>>2);
		
		System.out.println(x++ == ++y?(z--<++k? "A": "B" ): "C");	//C
		System.out.println(x++ < ++y?(z--<++k? "A": "B" ): "C");	//A
		
	}
}
