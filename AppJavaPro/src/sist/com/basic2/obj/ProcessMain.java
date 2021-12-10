package sist.com.basic2.obj;

public class ProcessMain {
	private Process process;
	
	public ProcessMain(Process process) {
		super();
		this.process = process;
	}



	public static void main(String[] args) {
		ProcessMain p1 = new ProcessMain(new ClientProcess());
		ProcessMain p2 = new ProcessMain(new AdminProcess());
		p1.process.connect();
		p2.process.connect();
	}
}
