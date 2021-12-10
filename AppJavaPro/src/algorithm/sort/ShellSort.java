package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
	
	public void gapSort(int [] arr, int start, int end, int gap) {
		int temp = 0;
		int j =0;
		System.out.printf("start : %d, end : %d, gap : %d\n",start, end, gap);
		
		for(int i = start+gap ; i<= end; i = i + gap) {
			temp = arr[i];
			System.out.printf("i = %d, temp : %d\n",i , temp);
			for(j = i - gap ; j >= start && temp < arr[j]; j -= gap ) {	//temp가 arr[j] 보다 작으면 교환 
				System.out.printf("*변환수행*\narr[%d]와  arr[%d] 변환\n", j, j+gap);
				System.out.println(Arrays.toString(arr) + "sort");
				arr[j+gap] = arr[j];
			}
			arr[j+gap] = temp;	//j가 -gap해서 나옴
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
	}
			
			
	
	
	
	public int [] shellSort(int [] arr) {
		
		int size =  arr.length;
		int gap =size/2;
		
		while(gap>=1) {
			
			for(int i = 0 ; i<gap; i++) {
				gapSort(arr, i, size-1, gap);
				System.out.println();
			}
			System.out.println("=======================================");
			System.out.println("gap / 2 수행\n");
			
			gap /= 2;
		}
		
		System.out.println("sort end");
		
		return arr;
	}
	
	public static void main(String[] args) {
		ShellSort s = new ShellSort();
		
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println(Arrays.toString(s.shellSort(arr)));
	}
}
