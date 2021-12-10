package sist.com.variable.basic;

public class VariableEx7 {
	//자료형 변수;   instance변수 Heap
	   public void methodEx1(int x,int y,int z) {//int x,int y,int z Paramter ,인자 (매개변수),지역변수
	      //지역변수 auto변수  Stack
	      //int x; 같은 공간에서 같은이름 할당 불가
	      x=x+1;
	      y=y+1;
	      z=z+1;
	      System.out.println("x="+x+" y="+y+" z="+z);//10 20  30
	      
	   }   
	   
	   public int method2(byte x, byte y) {
		   byte rs = (byte) (x+y);
		   System.out.println("rs = " + rs);
		   return rs+rs;
	   }
	   
	   public void method3(double x) {
		   
	   }
	   
	   public float method4(int x, int y) {
		   return x + y;
	   }
	   public static void main(String[] args) {
	      VariableEx7 v=new VariableEx7();
	      //v.methodEx1(1,2,3);//1,2,3 Arguments(전달인자)
	      int x=10,y=20,z=30;
	      v.methodEx1(x,y,z);
	      
	      v.method2((byte)10,(byte)20);
	      
	      v.method3(10);
	      
	      
	   }
}
