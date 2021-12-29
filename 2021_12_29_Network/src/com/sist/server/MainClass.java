package com.sist.server;

import com.sist.app2.music.Music;

import java.io.*;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        // CheckException => java.io, java.net, java.sql
        try {
            // 저장 (파일 읽기 => 메모리에 저장 => 제어)
            // 모든 사용자가 음악 저장 파일 가지고 있어야 한다
            // 서버 => 모든 접속자가 사용하는 데이터를 공유할 수 있게 만든다
            ArrayList<Music> mList = new ArrayList<>();
            // 파일 읽기 => mList에 저장
            FileInputStream fis = new FileInputStream("/Users/kimheejun/Desktop/test/music_object.txt");
            // 읽은 파일을 객체로 저장 (역직렬화)
            // 메모리 => 파일 => 오라클 (***) : 제어하기 쉽다
            // => CURD (검색, 수정, 추가, 삭제) => 여러개의 데이터를 혼합해서 데이터 읽기 가능
            //                                 ====> JOIN / SUBQUERY
            ObjectInputStream ois = new ObjectInputStream(fis); // 파일에 있는 데이터를 객체단위로 받기
            mList=(ArrayList<Music>) ois.readObject(); // 패키지명을 같게 해야한다.
            // Object readObject() => Object는 모든 클래스의 상위 (가장 큰 클래스)
            // 메모리에 저장된 데이터를 출력
            System.out.println("===== Music Top 200 =====");
            for (Music m : mList){
                System.out.println(m.getNo()+"."+m.getTitle());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
