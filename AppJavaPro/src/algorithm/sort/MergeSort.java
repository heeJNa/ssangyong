package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	int[] sorted;

	public void merge(int[] arr, int start, int mid, int end) {
		int i = start; // 병합할 왼쪽 배열의 첫번째
		int j = mid + 1; // 병합할 오른쪽 배열의 첫번째
		int k = start; // 병합한 배열의 첫번째

		// 작은 순서대로 sorted[] 에 삽입

		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		// i나 j중 한 곳의 값이 먼저 다 들어갔을때 남음쪽 데이터 삽입

		if (i > mid) {
			for (int t = j; t <= end; t++) {
				sorted[k] = arr[t];
				k++;
			}
		} else {
			for (int t = i; t <= mid; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}

		for (int t = start; t <= end; t++) {
			arr[t] = sorted[t];
		}

		System.out.println(Arrays.toString(sorted));
	}

	public void mergeSort(int[] arr, int start, int end) {

		sorted = new int[arr.length];

		if (start == end)
			return;

		int mid = (start + end) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);

		merge(arr, start, mid, end);

	}

	public static void main(String[] args) {
		MergeSort m = new MergeSort();

		Random random = new Random();
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴. }
		}
		System.out.println(Arrays.toString(arr));

		m.mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}
}
