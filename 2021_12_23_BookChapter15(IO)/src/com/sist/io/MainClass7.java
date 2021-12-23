package com.sist.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// => 파일에 있는 전체 데이터를 메모리에 한번에 저장 후 읽는 프로그램
// BufferedReader => 한줄씩 읽어 온다.
/*
*       File
*       =====
*           ==> 파일 정보 / 디렉토리 정보
*           ==> 주요 메소드
*               directory
*               =========
*                   => listFiles() : 폴더안에 있는 모든 데이터 읽기
*                   => mkdir() : 폴더 생성
*                   => delete() : 폴더 삭제
*                   => exists() : 존재여부 확인
*               file
*               ====
*                 => getName() : 파일명
*                 => getPath() : 경로명
*                 => length() : 크기
*                 => createNewFile() : 파일 생성
*       FileInputStream (1byte)
*       FileReader (2byte)
*           => read()
*           => read(byte[], int, int)
*       ===================
*       FileOutputStream (1byte)
*       FileWriter (2byte)
*           => write()
*       ===================
*       BufferedReader
*           => readline()
*
*       => 파일 업로드 (파일 복사)
*       => 외부데이터 저장 => 제어
* */
public class MainClass7 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/kimheejun/Desktop/test/news.txt");
            BufferedReader br=
                    new BufferedReader(new InputStreamReader(fis));
            while (true){
                String data = br.readLine();
                if(data==null) break; //값이 없는 경우에 종료
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();    // 에러 처리
        } finally {
            try {
                fis.close();    // 파일 닫기 (에러 유무에 상관없이)
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
