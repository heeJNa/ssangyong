package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	int[] sorted;

	public void merge(int[] arr, int start, int mid, int end) {
		int i = start; // ������ ���� �迭�� ù��°
		int j = mid + 1; // ������ ������ �迭�� ù��°
		int k = start; // ������ �迭�� ù��°

		// ���� ������� sorted[] �� ����

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
		// i�� j�� �� ���� ���� ���� �� ������ ������ ������ ����

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
			arr[i] = random.nextInt(100); // 100�� ���� �ʴ� ���� ���̳���. }
		}
		System.out.println(Arrays.toString(arr));

		m.mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}
}
