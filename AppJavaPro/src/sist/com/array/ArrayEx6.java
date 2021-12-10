package sist.com.array;

import java.util.Arrays;

public class ArrayEx6 {
	
	public void inject(int state, int []m) {
		for(int i = 0; i<m.length; i++) {
			if(state == 1) {
				m[i] = (int)(Math.random()*100+1);
			} else {
				m[i] = (i+1) *10;
			}
		}
	}
	
	public void disp(int []m) {
		System.out.println(Arrays.toString(m));
	}
	
	public void arrayPro1(int m[], int state ) {
	inject(state, m);
	disp(m);
	}
	
	public static void main(String[] args) {
		ArrayEx6 a = new ArrayEx6();
		int m1[] = new int[5];
		int m2[] = new int[5];
		a.arrayPro1(m1,1);
		a.arrayPro1(m2,2);
		
		m1 = new int [] {1,2,3,4,5};
		for(int i : m1) {
			i += 10;
			System.out.println(i);		//11, 12, 13, 14, 15
		}
		
		System.out.println(Arrays.toString(m1)); //[1, 2, 3, 4, 5]
		
	}
}
