package com.sist.en;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum 사이트{
    DAUM("www.daum.net"),
    NAVER("www.naver.com"),
    GOOGLE("www.google.com"),
    SIST("www.sist.co.kr"),
    NATE("www.nate.com");
    private String site;
    사이트(String site){
        this.site = site;
    }
    public String getSite() {
        return site;
    }
}
public class MainClass5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("방문 할 사이트 입력 : ");
        String s = scan.next();
        //사이트 찾기
        for (사이트 site : 사이트.values()){
            if (site.name().equalsIgnoreCase(s)){
                String ss =site.getSite();
                try{
                    // exe파일 실행시에 사용 => CheckException 사용
                    Runtime.getRuntime().exec("/Applications/Google Chrome.app"+ss);    //mac은 exec() 사용안됨
                }catch (Exception e){}
            }
        }
    }
}
