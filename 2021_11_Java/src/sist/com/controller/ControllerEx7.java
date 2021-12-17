package sist.com.controller;

import java.util.Scanner;

public class ControllerEx7 {

	Scanner scanner = new Scanner(System.in);

	public void controllerEx1() {

		String s = scanner.nextLine();

		int row = 0, col = 0;
		System.out.println("Row:");
		row = scanner.nextInt();
		System.out.println("Col:");
		col = scanner.nextInt();
		for (int i = 0; i < row; i++) { // 행
			for (int j = 0; j < col; j++) { // 열
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void showInteger() {
		System.out.println("1. 양수 2.음수");
		if(scanner.nextInt()==1) {
			for(int i =1; i<=100; i++) {
				if(i%7 == 0 )System.out.println();
				System.out.printf("%3d",i);
			}
		}else {
			for(int i =0; i>=-100; i--) {
				if(i%7 == 0 )System.out.println();
				System.out.printf("%3d",i);
			}
		}
			
//		System.out.println("showInteger");
	}

	public void showAlphabet() {
		int cnt = 0;
		for(int i ='a'; i<= 'z';i++) {
			if(cnt%8==0) {
				System.out.println();
			}
			System.out.printf("%c ",i);
			cnt++;
		}
		//System.out.println("showAlphabet");
	}
				

	public void controllerEx2() {

		while (true) {
			System.out.println("1. 정수출력 2. 알파벳출력 3.나가기");
			switch (scanner.nextInt()) {
			case 1:
				showInteger();
				break;
			case 2:
				showAlphabet();
				break;
			case 3:
				return;
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		ControllerEx7 c = new ControllerEx7();
		c.controllerEx2();
	}

}
