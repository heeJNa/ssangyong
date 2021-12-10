package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		int input =scanner.nextInt();
		
		while(input !=0) {
		sum += input;
		input =scanner.nextInt();
		}
		/* do While 문
		 * 
		 * do {
		 * 		input=scanner.nextInt();
		 * 		sum +=input;
		 * 
		 * }while(input !=0);
		 */
		
		System.out.println("합계는" + sum);
		
	}

}
