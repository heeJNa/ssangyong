package com.sist.string;

public class MainClass5 {
    public static void main(String[] args) {
        //int compareTo (String s)
        // => 라이브러리 리턴형, 매개변수, 메소드명, 기능
        //1.String 문자열을 저장
        //compareTo ==> 문자열 정렬
        String s1="AAA";
        String s2="DDD";
        int i = s1.compareTo(s2);
        System.out.println(i);
        //A-D => -3
        /*
        *   s1 - s2 ==> - (s2가 큰값을 가지고 있다)
        *   s1 - s2 ==> + (s1이 큰값을 가지고 있다)
        *   s1 - s2 ==> 0 (s1과 s2가 같은값을 가지고 있다)
        * */
        //concat ==> 원형) String concat(String s) => 문자열 결합 (+)
        s1 ="Heelo";
        s2 ="JAVA!!";
        System.out.println(s1+s2);
        String s3 = s1.concat(s2);  //문자열 결합 메소드
        System.out.println(s3);

    }
}
