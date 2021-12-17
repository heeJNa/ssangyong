package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	public int[] bubbleSort(int[] a) {
		int tmp = 0;
		for (int i = a.length; i > 0; i--) {
			boolean b = false;
			for (int j = 0; j < i-1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					b = true;
				}
			}
			if(!b) break;	//한번도 안바뀌면 false
		}
		return a;
	}

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b.bubbleSort(arr)));
		
	}

}
