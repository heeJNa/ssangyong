package algorithm.basic;

import java.util.Scanner;

public class StarTest {
	
//	*
//	**
//	***
//	****
//	*****

	public static void main(String[] args) {
		System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
		
		
		
