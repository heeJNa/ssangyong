package algorithm.basic;

import java.util.Scanner;

public class GaussSum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
