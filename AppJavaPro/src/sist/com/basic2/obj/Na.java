package sist.com.basic2.obj;

import java.io.File;

public class Na extends Father{

	public Na() {
		super();
	}
	public void game() {
	      System.out.println("game");
	   }
	public static void main(String[] args) {
		GrandFather f = new Father();
		GrandFather n = new Na();
		
		if(f instanceof Father) {
			System.out.println("dd");
			Father f1 = (Father)f;
			Na f2 =  (Na)n;
			
			f1.work();
			f2.game();;
		}
		
		GrandFather test = null;
		Father test2 = new Father();
		Father test3 = null;
		
		test = test2;
		
		test3 = (Father) test;
		
		Object o = new GrandFather();
		GrandFather g = new Na();
		if(g instanceof Na) {
			Na k = (Na)g;
			k.game();
			//File z= new File("txt");
			//z.createNewFile();
		}
		
		GrandFather gf = new Father();
		GrandFather gf2 = new GrandFather();
		
		gf.sleep();
		gf2.sleep();
	}
}
