package algorithm.basic;

import java.util.Scanner;

public class TreeTest {

	public void otherMethod() {
		int row = 5, col = 7;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < (int) Math.round(col / 2f) - i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		TreeTest tree = new TreeTest();

		int hight;

		while (true) {
			System.out.print("Ʈ���� ���̸� ������ �Է��ϼ���(3�̻�) >> ");

			Scanner scanner = new Scanner(System.in);
			hight = scanner.nextInt();
			if (hight < 3) {
				System.out.println("3�̻��� ���ڸ� �Է��Ͻÿ�");
			} else {
				for (int i = 0; i < hight; i++) {
					for (int j = i; j < hight - 1; j++) {
						System.out.print(' ');
					}
					for (int k = 0; k < i * 2 + 1; k++) {
						System.out.print("*");
					}

					System.out.println();

				}
				break;
			}
		}
		System.out.println("===================\n");
		tree.otherMethod();
	}

}
