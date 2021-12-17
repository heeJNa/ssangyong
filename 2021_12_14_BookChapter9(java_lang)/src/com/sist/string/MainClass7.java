package com.sist.string;

import java.util.Scanner;

/*
* statsWith, endsWith
* =================== 찾는 문자열 (시작 문자열, 끝나는 문자열)
* Java & Spring
* 자바와 JSP
* 자바와 오라클
*
* 원형)
*      public boolean startsWith(String s)
*      public boolean endsWith(String s)
* */
public class MainClass7 {
    public static void main(String[] args) {
        //데이터 저장
        String[] data={
                "혼자 배우는 자바",
                "자바와 오라클",
                "자바기반의 AWS",
                "오라클 프로그래밍",
                "자바 프로그래밍",
                "JSP AND MVC",
                "Spring Framework",
                "MyBatis 프로그래밍",
                "자바를 이용한 챗봇",
                "AWS를 이용한 배포"
        };
        //2. 사용자 입력
        Scanner scan = new Scanner(System.in);
        String fd= scan.next();
        //3. 해당 문자열 찾아서 출력
        for (String s : data){
            if(s.startsWith(fd)){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                System.out.println(s);
            }
        }
    }
}
