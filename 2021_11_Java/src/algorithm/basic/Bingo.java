package algorithm.basic;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		final int SIZE = 5;
		int x = 0, y = 0;
		int input;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = i * SIZE + 1 + j;
			}
		}

		for (int i = 0; i < SIZE; i++) {// shuffle
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					System.out.printf("%3d", bingo[i][j]);
				}
				System.out.println();
			}

			System.out.printf("1~%d의 숫자를 입력하시오(종료 : 0) >>", SIZE*SIZE);
			input = scanner.nextInt();

			outer: 
				for (int i = 0; i < bingo.length; i++) {
					for (int j = 0; j < bingo[i].length; j++) {
						if (input == bingo[i][j]) {
							bingo[i][j] = 0;
							break outer;
						}
				}

			}
		} while (input != 0);
	}
}
