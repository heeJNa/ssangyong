package sist.com.basic2.obj;

public class ClientProcess extends Process{
	public void clientAction() {
		System.out.println("clientAction");
	}

	@Override
	public void connect() {
		System.out.println("ClientProcess connect");
	}
	
}
