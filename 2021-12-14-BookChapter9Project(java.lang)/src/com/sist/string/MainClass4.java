package com.sist.string;
//charAt
//문자열을 입력받아서 문자가 좌우 대칭 여부 확인하는 프로그램
//ABBA
// => 구글 코테
// => 그림 거꾸로 출력문제 유행

import java.util.*;

//1. length() => 문자 갯수(오류 처리) ==> 문자열이 짝수여야 한다
//2. charAt()
public class MainClass4 {
    // aaa bbb ==> String 2개를 받아야됨. ==> nextLine() => enter으로 받음.
    public static void main(String[] args) {
        //문자열 입력을 받는다
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String s = scan.next(); //공백에서 짤라서 받음.
        if ((s.length() % 2) == 0) {
            System.out.println("정상 수행이 가능합니다!!");
            boolean bCheck = true;
            for (int i = 0; i < s.length() / 2; i++) {
                char f = s.charAt(i);
                char e = s.charAt(s.length() - 1 - i);
//                System.out.println(f+"|"+e);
                if (f != e) {
                    bCheck = false;
                    break;
                }
            }
            if (bCheck) {
                System.out.println("좌우대칭 입니다.");
            } else {
                System.out.println("좌우대칭이 아님니다.");
            }
        } else {
            System.out.println("입력한 문자갯수가 짝수여야 합니다!!");
        }
    }
}
