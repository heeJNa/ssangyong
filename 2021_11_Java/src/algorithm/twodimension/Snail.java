package algorithm.twodimension;

import java.util.Arrays;
import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달팽이 집의 크기를 입력하시오 >> ");
		int length = scanner.nextInt();

		int[][] snail = new int[length][length];
		int num = snail.length;
		int right = 0;
		int down = 0;
		int left = 0;
		int up = 0;
		int count = 1;

		while (count <= length*length) {
			for (int i = up; i < num - down; i++) {
				snail[right][i] = count++;
			}
			right++;
			for (int i = right; i < num - left; i++) {
				snail[i][num-1-down] = count++;
			}
			down++;
			for (int i = num - 1 -down; i >= up; i--) {
				snail[num-1-left][i] = count++;
			}
			left++;
			for (int i = num - left-1; i >= right; i--) {
				snail[i][up] = count++;
			}
			up++;
		}

		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail[i].length; j++) {
				System.out.printf("%3d", snail[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		for(int [] i : snail) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}

}
