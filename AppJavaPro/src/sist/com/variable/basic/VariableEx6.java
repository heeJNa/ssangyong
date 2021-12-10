package sist.com.variable.basic;

public class VariableEx6 {
	
	public void variableMethod1(){
		int i = 0;
		System.out.println(i);
	}
	
	public void variableMethod1(int i){
		System.out.println(i);
	}
	public void variableMethod2(float value) {
		
	}
	
	public static void main(String[] args) {
		VariableEx6 v= new VariableEx6();
		v.variableMethod2(1.24f);
	}
}
