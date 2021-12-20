package com.sist.collection;
//Set, Map
/*
    Collection
        List ==> ArrayList
        Set  ==> HashSet, TreeSet
                ======== ArrayList에 있는 데이터중에 중복이 없는 값 추출
                         영화 : 장르, 맛집 : 음식종류
        Map  ==> HashMap(HashTable의 단점을 보완), Hashtable
                 클래스 관리 (컨테이너), 웹의 대부분의 클래스 Map
                 순서는 없고 키와 값 ==>Cookie이용, session이용
       =================출력시에 Iterator를 이용해서 출력하는 프로그램이 많다.
*/

import java.util.HashSet;
import java.util.Set;

public class MainClass7 {
    public static void main(String[] args) {
        //저장 공간을 만든다
        HashSet<String> set = new HashSet<>(); //데이터 저장시 중복없는 데이터만 설정, 순서가 없다
        set.add("자바");
        set.add("오라클");
        set.add("HTML5");
        set.add("CSS");
        set.add("JavaScript");
        set.add("JSP");
        set.add("Spring");
        set.add("신기술:Spring-Boot,VueJS,ReactJS,AI");
        set.add("AWS:배포,리눅스");
        set.add("CSS"); //자동으로 중복된 데이터가 제거됨.(첨부x)
        System.out.println("====== for-each ======");
        for (Object obj : set){
            System.out.println(obj); //obj.toString() => toString()은 생략한다.
        }
        System.out.println("====== 제거후 ======");
        set.remove("자바");
        for (Object obj : set){
            System.out.println(obj); //obj.toString() => toString()은 생략한다.
        }

    }
}
