package com.sist.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass1 {
    public static void main(String[] args) {
        MusicSystem ms = new MusicSystem();
        // 1. 중복없는 가수
        ArrayList<String> list = ms.singerData();
        // 출력
        Collections.sort(list);
        for(int i =0; i< list.size();i++){
            System.out.println((i+1)+". "+list.get(i));
        }
        System.out.println("========= 전체목록 =========");
        ArrayList<Music> mList = ms.musicAllData();
        for (Music m : mList) {
            System.out.println("순위 : " + m.getRank());
            System.out.println("곡명 : " + m.getTitle());
            System.out.println("가수명 : " + m.getSinger());
            System.out.println("앨범 : " + m.getAlbum());
            System.out.println("=================================");
        }
        System.out.println("========== 찾기 ==========");
        Scanner scan =new Scanner(System.in);
        System.out.print("검색어 입력 : ");
        String ss = scan.next();
        ArrayList<Music> sList = ms.musicFindData(ss);
        if(sList.isEmpty()) {
            System.out.println("검색된 데이터가 없습니다!!");
        }else{
            for (Music m : sList) {
                System.out.println(m.getTitle()+"("+m.getSinger()+")");
            }
        }
    }
}
