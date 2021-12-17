package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	void quick(int[] a, int start, int end) {

		if (start >= end) {
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;
		int tmp;

		System.out.printf("\npivot : %d, left : %d , right : %d\n", pivot, left, right);

		while (left <= right) {
			System.out.print("left : ");
			while (left <= end && a[pivot] >= a[left]) {
				left++;
				System.out.printf("%-2d", left);
			}
			System.out.print("\nright : ");
			while (right > start && a[pivot] <= a[right]) {
				right--;
				System.out.printf("%-2d", right);
			}
			System.out.println();
			if (left > right) {
				tmp = a[right];
				a[right] = a[pivot];
				a[pivot] = tmp;
				System.out.printf("pivot인 a[%d] 와 a[%d] 교환\n", pivot, right);
			} else {
				tmp = a[right];
				a[right] = a[left];
				a[left] = tmp;
				System.out.printf("a[%d] 와 a[%d] 교환\n", left, right);
			}
			System.out.println(Arrays.toString(a));
		}

		quick(a, start, right - 1);
		quick(a, right + 1, end);

	}

	public void disp(int[] a) {

		System.out.print("\n결과 : ");
		for (int i : a) {
			System.out.printf("%-3d", i);
		}
	}

	public static void main(String[] args) {
		QuickSort a = new QuickSort();
		Random random = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}
		System.out.println(Arrays.toString(arr));

		a.quick(arr, 0, arr.length - 1);
		a.disp(arr);
	}
}
	


