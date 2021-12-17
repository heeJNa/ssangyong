package com.sist.string;

import java.util.Scanner;

//469page ~ 471page (String) =>AI,RPA,통계, 수집 => 문자열
//웹, 윈도우  => 문자열만 사용이 가능
// HTML => <input type="text"> 10 ==> "10"
public class MainClass3 {
    //인스턴스 => MainClass3을 메모리에 저장후에 사용
    //throws => 선언된 예외클래스를 처리후에 사용을 해야된다.
    public void calc()
            throws ArithmeticException, NumberFormatException, Exception {
        Scanner scan = new Scanner(System.in);
        //숫자 2개 입력, 연산자 입력
        //scan,bufferedReader ==> char(x), String으로만 받을 수 있다.
        System.out.print("첫번째 정수 입력 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = scan.nextInt();

        System.out.print("연산자 입력(+,-,*,/) : ");
        String temp = scan.next();

        //switch = > 문자열 case "+":
        char op = temp.charAt(0);   //char로 변환
        switch (op) {
            case '+' -> System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
            case '-' -> System.out.printf("%d + %d = %d", num1, num2, num1 - num2);
            case '*' -> System.out.printf("%d + %d = %d", num1, num2, num1 * num2);
            case '/' -> System.out.printf("%d + %d = %.2f", num1, num2, num1 / (double)num2);
            //강제 형변환
            default -> System.out.println("잘못된 연산자입니다!");
        }
    }

    public static void main(String[] args) {
        MainClass3 m3 = new MainClass3();
        //인스턴스 변수와 인스턴스 메소드가 메모리에 저장됨
        try {
            m3.calc();  //예외처리가 없어서 에러 => 받아야함
        } catch (Exception e) {
            //여러개의 예외처리가 선언된 경우 ==> 가장 큰 예외처리를 할 수 있다.
            //Exception, Throwable
            e.printStackTrace();
        }
    }
}
