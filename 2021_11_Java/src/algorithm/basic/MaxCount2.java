package algorithm.basic;

public class MaxCount2 {
	public void disp(int[] m) {
		for (int i : m) {
			System.out.printf("%3d", i);
		}
		System.out.println();
	}

	public int arrayCount(int[] m) {
		int mx = 0;
		for (int i = 0; i < m.length; i++) {
			if (mx < m[i]) {
				mx = m[i];
			}
		}
		return mx;
	}

	public void mode(int[] m) {
		int[] c = new int[m.length];
		// m[10][1][1][1][1][5][5][5][5][9]
		// c[1] [4][4][4][4][4][0][0][0][0]
		sort(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i] == m[j]) {
					c[i]++;
				}
			}
		}

		int temp = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == arrayCount(c)) {// 1 == 4, 4==4
				if (temp != 0 && temp == m[i])
					continue;
				System.out.print(m[i] + "\t");
				temp = m[i];
			}
		}
	}

	public void sort(int[] arr) { // 선택 정렬
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}

	}

	public static void main(String[] args) {
		MaxCount2 a = new MaxCount2();
		int[] m = { 4, 1, 4, 4, 2, 4, 2, 2, 2, 5 };
		// a.disp(m);
		a.mode(m);

	}

}
