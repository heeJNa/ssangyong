package sist.com.controller;

public class ControllerEx1 {
	
	public void ifTest() {
		int x =1;
		
		if(x++==1) {
			System.out.println("x = 1");
			if(x++==2) {
				System.out.println("x = 2");
				if(x==3) {
					System.out.println("x = 3");
				}else {
					System.out.println("x != 3");
				}
			}else {
				System.out.println("x != 2");
			}
		}else {
			System.out.println("x != 1");
		}
	}
	
	public void controllerEx1() {
		int x = 1;
		//System.out.println(x++ == 1);
		if(x++ == 1) {
			System.out.println("if x++ == 1");
		}else {
			System.out.println("else x++ == 1");
		}
		
	}
	
	
	public static void main(String[] args) {
		ControllerEx1 c = new ControllerEx1();
		c.controllerEx1();
		int x =1;
		boolean b = ++x == 2 && x++ == 3 || ++x == 4;
		System.out.println(b + " " + x);
		x=1;
		boolean b2 = ++x == 2 && ++x == 3 || ++x == 4;
		System.out.println(b2 + " " + x);
		c.ifTest();
	}
}
