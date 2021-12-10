package algorithm.twodimension;

import java.util.Random;

public class Convert {

	int[][] arr = new int[4][3];
	int[][] convertArr = new int[3][4];;

	public void convert() {
		random();
		int low = 0;
		int col = 0;

		for (int i = 0; i < convertArr.length; i++) {
			for (int j = 0; j <convertArr[i].length; j++) {
				if (col == arr[low].length) {
					low++;
					col = 0 ;
				}
				convertArr[i][j] = arr[low][col++];
			}
		}
		System.out.println();
		disp(convertArr);
	}
				

	private void random() {
		Random random = new Random();
		arr = new int[4][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(100);
			}
			System.out.println();
		}
		disp(arr);
	}

	private void disp(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Convert c = new Convert();
		c.convert();
	}

}
