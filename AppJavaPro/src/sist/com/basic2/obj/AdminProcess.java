package sist.com.basic2.obj;

public class AdminProcess extends Process{
	public void adminAction() {
		System.out.println("adminAction");
	}
	
	@Override
	public void connect() {
		System.out.println("AdminProcess connect");
	}
}
