package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class CountingSort {

	public void countingSort(int[] arr, int underNum) {
		System.out.println(underNum + "이하의 숫자 계수정렬");
		
		int[] count = new int[underNum+1];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < underNum)
				count[arr[i]]++;
		}
			

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				for (int j = 0; j < count[i]; j++) {
					System.out.printf("%-2d, ",i);
				}
			}
		}

	}

	public static void main(String[] args) {
		CountingSort c = new CountingSort();

		Random random = new Random();
		int[] arr = new int[40];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}
		System.out.println(Arrays.toString(arr));
		c.countingSort(arr, 50);
	}

}
