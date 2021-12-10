package sist.com.array;

import java.util.Arrays;

//배열개념 : 같은 기억장소의 모임
//배열목적 : 일괄처리
//배열에 하나하나 공간들을 element(요소)
public class ArrayEx1 {
	
	public void arrayEx1() {
		int[] m1 =new int[5];	//heap메모리에 만들어짐, 변수(m1)는 스택에 만들어짐 
		m1[0] = 10;
		m1[1] = 20;
		m1[2] = 30;
		m1[3] = 40;
		m1[4] = 50;
		for(int i = 0; i< m1.length;i++) {
			System.out.printf("m[%d] =%-3d%n",i,m1[i]);
		}
		
	}
	
	public void arrayEx2() {
		int[] m= {10,20,30,40,50,60,70,80,90};
		for(int i : m)
			System.out.printf("%-5d",i);
		
		System.out.println();
		
		int j = 0;
		while(j<m.length) {
			System.out.printf("%-5d",m[j++]);
		}
		
		System.out.println();
		
		int k =0;
		do {
			System.out.printf("%-5d",m[k++]);
		}while(k<m.length);
	}
	
	public void arrayEx3() {
		(new int[5])[0]=10;	//배열생성
		(new int[5])[1]=10;	//또 새로운 배열 생성
		System.out.println((new int[5])[0]);	//또 다시 새로운 배열 생성
		
		 int []m=new int[5];//[10][20][][][]
	      m[0]=10;
	      m[1]=20;
	}
	
	public int [] arrayEx4() {
		int[] a = new int[10];
		a[0] =10;
		a[1] = 20;
		return a;
	}
	

	public static void main(String[] args) {
		ArrayEx1 a =new ArrayEx1();
		a.arrayEx1();
		a.arrayEx2();
		
		System.out.println();
		
		a.arrayEx3();
		
		System.out.println();
		
		System.out.println(a.arrayEx4()[0]+a.arrayEx4()[1]);
		
//		int[] arr = {100, 95, 90, 85, 80};
//		System.out.println(Arrays.toString(arr));
	}

}
