package src.com.sist.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	
	Scanner scan = new Scanner(System.in);
	
	public byte input() throws InputMismatchException{
		System.out.print("0~32767까지의 정수 입력 : ");
		byte num = scan.nextByte();
		binary(num);
		return num;
	}
	
	public void binary(int num) {
		int[] binary = new int[16];
		for(int i = 0; i<binary.length; i++) {
			binary[i]=num%2;
			num /= 2;
			if(num==0)
				break;
		}
		printBinary(binary);
	}
	
	public void printBinary(int[] binary) {
		for(int i = 0; i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[binary.length-i-1]);
		}
	}
	
	public static void main(String[] args) {
		try {
		Test2 t = new Test2();
		t.input();
		}catch(InputMismatchException e) {
			System.out.println("0~32767사이의 숫자를 입력하시오");
			e.printStackTrace();
		}
	}
}
