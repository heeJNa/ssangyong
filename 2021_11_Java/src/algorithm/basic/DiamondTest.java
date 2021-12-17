package algorithm.basic;

import java.util.Scanner;

public class DiamondTest {

	public static void main(String[] args) {
		int hight;

		while (true) {
			System.out.print("다이아몬드의 높이를 홀수 정수로 입력하세요(3이상) >> ");

			Scanner scanner = new Scanner(System.in);
			hight = scanner.nextInt();
			if (hight%2 == 0 || hight < 3) {
				System.out.println("3이상의 홀수 숫자를 입력하시오");
				continue;
			} else {
				for (int i = 0; i < hight/2+1; i++) {
					for (int k = i; k < hight / 2; k++) {
						System.out.print(' ');
					}
					for (int j = 0; j < i * 2 + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = hight-1 ; i > hight/2; i--) {
					for (int k = hight - i; k >0; k--) {
						System.out.print(' ');
					}
					for (int j = i*2 -1 ; j > hight-1 ; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
			break;
		}
		
		System.out.println("종료");
	}
}
