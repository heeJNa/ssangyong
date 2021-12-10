package algorithm.sort;

import java.util.Arrays;
import java.util.Random;


public class RadixSort {

	public void radixSort(int[] arr) { // ���� ū ���� ã�´�
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i - 1], arr[i]);
		}
		radixSort(arr, arr.length, max);
	}

	public void radixSort(int[] data, int n, int max) { // ���� ū ���� �ڸ������� �ݺ��ؼ� �������
		for (int i = 1; (max / i) > 0; i = i * 10) {
			countingSort(data, n, i);
		}
	}

	public void countingSort(int[] data, int n, int digit) { // digit�� 1, 10, 100 ������ ����
		int[] tmp = new int[n];
		int[] cnt = new int[10];

		System.out.println(digit + "�� �ڸ� ���� �� ��");
		disp(data);

		for (int i = 0; i < n; i++) {
			cnt[(data[i] / digit) % 10]++;
		}

		for (int i = 1; i <= 9; i++) {
			cnt[i] += cnt[i - 1]; 					// �������� �̿��Ͽ�, ���Ұ� �� ��ġ�� �̸� ����մϴ�.
		// ���� ���� ������� �ϸ�, ������ ������� ������ ����
		// �ǵ��� �ڸ��� ��ġ�ϵ��� �� �� �ֽ��ϴ�.

		}
		for (int i = n - 1; i >= 0; i--) {
			int cntValue = (data[i] / digit) % 10;
			int newIdx = cnt[cntValue] - 1; 		// �ε����� 0���� �����ϹǷ�, -1�� ���־����ϴ�.
			tmp[newIdx] = data[i]; 					// data[i]�� tmp[newIdx]�� ����
			cnt[cntValue]--;						//�ϳ��� ��ġ�Ͽ����Ƿ�, ������ �ϳ� ���ݴϴ�.

		}
		for (int i = 0; i < n; i++) { // tmp[]�� �ִ� �����͸� data[]�� �ٽ� ����
			data[i] = tmp[i];
		}

		System.out.println(digit + "�� �ڸ� ���� �� ��");
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
			arr[i] = random.nextInt(500); // 500�� ���� �ʴ� ���� ���̳���. }
		}

		System.out.println("�ʱⰪ" + Arrays.toString(arr));

		r.radixSort(arr);
	}
}
