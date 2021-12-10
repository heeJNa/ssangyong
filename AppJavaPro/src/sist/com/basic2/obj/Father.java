package sist.com.basic2.obj;

public class Father extends GrandFather{
		
	public Father() {
		super();
	}
	
	public void work() {
		System.out.println("work");
	}

	@Override
	public void sleep() {
		System.out.println("Father sleep");
	}
}
