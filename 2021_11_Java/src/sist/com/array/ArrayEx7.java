package sist.com.array;

import java.util.Arrays;

public class ArrayEx7 {
	
	int index;
	int []m = new int [5];
	
	public void arrayReverse(int []x) {
		int [] imsi = new int[x.length];
		int j = x.length-1;
		int tmp;
		
		for(int i = 0; i<x.length/2; i++) {
			tmp = x[i];
			x[i] = x[j];
			x[j]= tmp;
			j--;
		}
		System.arraycopy(x, 0, imsi, 0, x.length);
	}
	
	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		int[] arr = {1,2,3,4,5,6,7};
		a.arrayReverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
