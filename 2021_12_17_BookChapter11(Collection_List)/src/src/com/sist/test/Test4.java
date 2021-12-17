package src.com.sist.test;

import java.util.Scanner;

public class Test4 {
	
	Scanner scan = new Scanner(System.in);
	private int year;
	private boolean yun;
	
	public void inputYear() {
		System.out.print("년도 입력:");
		year = scan.nextInt();
		if(year <0) {
			System.out.println("0이상을 입력하시오");
			return;
		}
		yunYearCheck(year);
		print();
	}
	
	public void yunYearCheck(int year) {
		if(year%4 ==0 && year%100 != 0 || year %400 ==0) {
			yun = true;
		}else 
			yun = false;
	}
	
	public void print() {
		if(yun) {
			System.out.println(year +"년도는 윤년이 입니다.");
		}else {
			System.out.println(year +"년도는 윤년이 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.inputYear();
	}
}
