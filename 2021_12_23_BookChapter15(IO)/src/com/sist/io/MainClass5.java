package com.sist.io;
// 파일에 쓰기
// FileOutputStream (1byte) => 바이트 스트림 (한글)
// FileWriter => (2byte) 문자스트림 => String
/*
 *       File
 *       FileInputStream / FileOutputStram
 *       FileReader / FileWriter
 *       ObjectInputStream / ObjectOutputStream
 *       BufferedReader : 네트워크에서도 사용
 *
 *       enum / 어노테이션 / 정규식
 *       =============== 스프링
 *
 *       1. 일반자바 (1장~8장)
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainClass5 {
    public static void main(String[] args) {
        //모든 클래스는 초기값이 null(주소값을 가지고 있지 않다)
        FileOutputStream fos = null;    //메소드 (지역변수 => 반드시 초기화)
        FileReader fr = null;
        try {
            // 1. 폴더 만들기
            File dir = new File("/Users/kimheejun/Desktop/test");
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("폴더 생성 완료");
            }
            // 2. 파일을 만들기
            File file = new File("/Users/kimheejun/Desktop/test/test.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("파일 생성 완료");
            }
            // 3. 파일 쓰기
            fos = new FileOutputStream(file, true);
            Scanner scan = new Scanner(System.in);
            System.out.println("이름 입력 : ");
            String name = scan.next();
            System.out.println("국어 입력 : ");
            int kor = scan.nextInt();
            System.out.println("영어 입력 : ");
            int eng = scan.nextInt();
            System.out.println("수학 입력 : ");
            int math = scan.nextInt();
            /*String hong ="홍길동|80|90|70";
            fos.write(hong.getBytes(StandardCharsets.UTF_8));//byte로 변환*/
            String data = name + "|" + kor + "|" + eng + "|" + math + "\n";
            fos.write(data.getBytes());
            // 4. 파일 읽기
            fr = new FileReader(file);
            int i = 0;
            String msg = "";
            while ((i = fr.read()) != -1) {
                msg += String.valueOf((char) i);
            }
            System.out.println(msg);
            //데이터 조절
            String[] student = msg.split("\n");
            for (String s : student) {
                String[] info = s.split("\\|");
                // StringTokenizer
                // 문자열 => 파일 읽기 (문자열)
                // 정수가 필요한 경우에는 반드시 변환 Integer.parseInt(info[1])
                System.out.println(info[0] + " "
                        + info[1] + " "
                        + info[2] + " "
                        + info[3] + " "
                        + (Integer.parseInt(info[1])
                        + Integer.parseInt(info[2])
                        + Integer.parseInt(info[3]))
                        + " "
                        + (Integer.parseInt(info[1])
                        + Integer.parseInt(info[2])
                        + Integer.parseInt(info[3])) / 3);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
