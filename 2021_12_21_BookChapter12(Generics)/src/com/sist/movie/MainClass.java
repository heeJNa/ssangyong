package com.sist.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        MovieSystem movieSystem = new MovieSystem();
        MainClass mc = new MainClass();
        while (true){
            int m = mc.menu();
            switch (m) {
                case 1 -> {
                    ArrayList<Movie> list = movieSystem.movieAllData();
                    for (Movie mm : list) {
                        System.out.println(mm.getNo() + ". " + mm.getTitle() +
                                "(" + mm.getScore() + ")");
                    }
                }
                case 2 -> {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("상세볼 영화 선택(1~20) : ");
                    int no = scan.nextInt();
                    Movie mm = movieSystem.movieDetailData(no);
                    System.out.println("순위: " + mm.getNo());
                    System.out.println("영화명: " + mm.getTitle());
                    System.out.println("평점: " + mm.getScore());
                    System.out.println("예매율: " + mm.getReserve());
                    System.out.println("개봉일: " + mm.getRegdate());
                    System.out.println(mm.getStory());

                }
                case 3 -> {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("검색어 입력 : ");
                    String title = scan.next();
                    ArrayList<Movie> list = movieSystem.MovieFind(title);
                    for (Movie mm : list) {
                        System.out.println(mm.getTitle());
                    }
                }
                case 4 -> {
                    System.out.println("프로그램을 종료합니다!!");
                    System.exit(0);
                }
            }
        }
    }
    int menu(){
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 영화 목록 보기");
        System.out.println("2. 영화 상세 보기");
        System.out.println("3. 영화 찾기");
        System.out.println("4. 종료");
        System.out.println("===============");
        Scanner scan = new Scanner(System.in);
        System.out.print("메뉴 선택(1~4) : ");
        return scan.nextInt();
    }
}
