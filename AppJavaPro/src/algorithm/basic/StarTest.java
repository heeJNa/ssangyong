package algorithm.basic;

import java.util.Scanner;

public class StarTest {
	
//	*
//	**
//	***
//	****
//	*****

	public static void main(String[] args) {
		System.out.print("*�� ����� ������ ���� �Է��ϼ��� >> ");
		
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
		
		
		
