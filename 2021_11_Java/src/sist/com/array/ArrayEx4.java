package sist.com.array;

public class ArrayEx4 {
	
	int []m = new int [5];
	public void initArray() {
		for(int i = 0; i<m.length; i++) {
			m[i] = (int)(Math.random()*100);
		}
	}
	
	public void rank(){
		
	}
	
	public void disp() {
		for(int i: m) {
			System.out.printf("%5d",i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayEx4 a = new ArrayEx4();
		a.initArray();
		a.rank();
	}

}
