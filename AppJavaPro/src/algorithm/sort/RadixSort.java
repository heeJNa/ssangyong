package algorithm.sort;

import java.util.Arrays;
import java.util.Random;


public class RadixSort {

	public void radixSort(int[] arr) { // 가장 큰 값을 찾는다
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i - 1], arr[i]);
		}
		radixSort(arr, arr.length, max);
	}

	public void radixSort(int[] data, int n, int max) { // 가장 큰 값의 자리수까지 반복해서 계수정렬
		for (int i = 1; (max / i) > 0; i = i * 10) {
			countingSort(data, n, i);
		}
	}

	public void countingSort(int[] data, int n, int digit) { // digit은 1, 10, 100 순으로 들어옴
		int[] tmp = new int[n];
		int[] cnt = new int[10];

		System.out.println(digit + "의 자리 정렬 전 값");
		disp(data);

		for (int i = 0; i < n; i++) {
			cnt[(data[i] / digit) % 10]++;
		}

		for (int i = 1; i <= 9; i++) {
			cnt[i] += cnt[i - 1]; 					// 누적합을 이용하여, 원소가 들어갈 위치를 미리 계산합니다.
		// 위와 같은 방식으로 하면, 임의의 순서대로 들어오는 값도
		// 의도한 자리에 위치하도록 할 수 있습니다.

		}
		for (int i = n - 1; i >= 0; i--) {
			int cntValue = (data[i] / digit) % 10;
			int newIdx = cnt[cntValue] - 1; 		// 인덱스는 0부터 시작하므로, -1을 해주었습니다.
			tmp[newIdx] = data[i]; 					// data[i]를 tmp[newIdx]에 저장
			cnt[cntValue]--;						//하나를 배치하였으므로, 개수를 하나 빼줍니다.

		}
		for (int i = 0; i < n; i++) { // tmp[]에 있는 데이터를 data[]로 다시 저장
			data[i] = tmp[i];
		}

		System.out.println(digit + "의 자리 정렬 후 값");
		disp(data);

	}

	public void disp(int[] arr) {
		for (int i : arr) {
			System.out.printf("%-4d", i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RadixSort r = new RadixSort();

		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(500); // 500을 넘지 않는 랜덤 값이나옴. }
		}

		System.out.println("초기값" + Arrays.toString(arr));

		r.radixSort(arr);
	}
}
