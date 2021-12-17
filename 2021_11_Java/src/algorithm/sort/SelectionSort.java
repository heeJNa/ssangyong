package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	int[] m = new int[10];

	public void initArray() {
		Random random = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100); // 100을 넘지 않는 랜덤 값이나옴.

		}
		System.out.println(Arrays.toString(m));
	}

	public void swap(int i, int j) {
		int tmp = 0;
		tmp = m[i];
		m[i] = m[j];
		m[j] = tmp;
	}

	public void selectionSort() {

		for (int i = 0; i < m.length; i++) {
			int min = 9999;
			int index = i;
			for (int j = i; j < m.length; j++) {
				if (min > m[j]) {
					min = m[j];
					index = j;
				}
			}
			swap(i, index);
		}

	}

	public void disp() {
		for (int i : m) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		s.initArray();
		s.selectionSort();
		s.disp();

	}

}
