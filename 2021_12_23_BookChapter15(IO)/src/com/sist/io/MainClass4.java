package com.sist.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// 파일 입출력 => 영구적인 저장
/*
*       FileInputStream / FileOutputStream
*       FileReader / FileWriter
*
*       파일 쓰기 => 모드 (w, a)
*       w : create (파일을 덮어 쓴다) => 기존에 있는 데이터를 지우고 새로운 파일 생성
*       a : append : 기존의 있는 데이터를 그대로 둔 상태에서 데이터 추가가
*       ========== 한글 저장 =================================
*       FileWriter fw = new FileWriter("경로명") => w
*       FileWriter fw = new FileWriter("경로명",true) => a
*       ========== 파일 복사, 업로드 ======================================
*       FileOutputStream fis = new FileOutputStream("경로명")  => w
*       FileOutputStream fis = new FileOutputStream("경로명",true) => a
*
* */
public class MainClass4 {
    public static void main(String[] args) {
        FileInputStream fis = null; //1byte씩 읽어오는 클래스
        // 한글 => 2바이트 ==> 문자 스트림 (FileReader)
        try{
            fis = new FileInputStream("/Users/kimheejun/IdeaProjects/Ssangyong_new/2021_12_23_BookChapter15(IO)/src/com/sist/io/MainClass.java");
            // 1byte로 읽는다 => 한글자씩 읽어온다 => int (문자의 번호)
            // A => 65
            int i = 0; //문자 한개를 받아서 저장할 변수
            // => 파일의 끝까지 읽는다 (EOF => End Of File) => -1
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            // 서버닫기, 파일 닫기, 오라클 닫기
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
