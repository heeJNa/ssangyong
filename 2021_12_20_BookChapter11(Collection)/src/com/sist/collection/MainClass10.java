package com.sist.collection;
//Set => TreeSet

import java.util.*;
/*
    ArrayList, HashSet, HashMap ==> 웹
*/
public class MainClass10 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        //데이터 추가
        set.add(80);
        set.add(100);
        set.add(70);
        set.add(85);
        set.add(98);
        set.add(83);

        System.out.print("가장 낮은 점수 : ");
        int min = 100;
        for(int score:set){
            int a=score;
            if(min>a)
                min = a;
        }
        System.out.println(min);
        System.out.println("가장 낮은 값 : "+set.first());   //최소값
        System.out.print("가장 높은 점수 : ");
        int max = 0;
        for(int score:set){
            int a=score;
            if(max<a)
                max = a;
        }
        System.out.println(max);
        System.out.println("가장 높은 값 : "+ set.last());   //최대값
        System.out.println(set.lower(90));  //90이하 => 가장 근사치
        System.out.println(set.higher(90)); //90이상 => 가장 근사치
        System.out.println(set.floor(98));  //98이거나 바로 아래
        System.out.println(set.ceiling(97)); //97이거나 바로 위

        NavigableSet<Integer> d = set.descendingSet();  //내림차순으로 정렬
        System.out.println(d.toString());

        NavigableSet<Integer> a= d.descendingSet();  //다시 역순으로 출력
        System.out.println(a.toString());

        //~ORDER BY no DESC|ASC
    }
}
