package sist.com.variable.basic;

//class�� ���赵, ����� ���� �ڷ���
public class VariableEx2 {
	int cnt = 0;
	
	public void methodAction1() {
		System.out.println("methodAction1");
		methodAction2();
	}
	
	public void methodAction2() {
		if(cnt++>=5) return;
		System.out.println("methodAction2");
		methodAction2();
	}
	
	
	  public static void main(String[] args) {
	  
		  VariableEx2 ex = new VariableEx2();
		  ex.methodAction2();
		 
	  }
	 
}
