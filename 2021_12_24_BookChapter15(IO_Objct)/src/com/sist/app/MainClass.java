package com.sist.app;
// ArrayList단위로 파일을 저장 ==> 저장 활용
// /Users/kimheejun/IdeaProjects/Ssangyong_new/2021_11_BookChapter8/movie.txt

/*
 *       1|
 *       쇼생크 탈출|
 *       드라마|
 *       https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 *       팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 *       2016 .02.24 재개봉, 1995 .01.28 개봉|
 *       15세 관람가|
 *       프랭크 다라본트
 * */

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// implements Serializable => 단위 : 객체단위
@Getter
@Setter
class Movie implements Serializable {
    private int mno;
    private String title;
    private String genre;
    private String poster;
    private String actor;
    private String regdate;
    private String grade;
    private String director;
}

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        try {
            // 파일 읽어서 => ArrayList에 저장
            // ArrayList => 통째로 파일에 저장
            FileInputStream fis = new FileInputStream("/Users/kimheejun/IdeaProjects/Ssangyong_new/2021_11_BookChapter8/movie.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            // byte => char로 변환 : InputStreamReader
            while(true){
                // 한줄씩 읽어온다
                String data = br.readLine();
                if(data==null){
                    break;
                }
                // | => 데이터를 잘라온다 ==> Movie => ArrayList
                // split(), StringTokenizer
                StringTokenizer st = new StringTokenizer(data,"|");
                Movie m = new Movie();
                m.setMno(Integer.parseInt(st.nextToken()));
                m.setTitle(st.nextToken());
                m.setGenre(st.nextToken());
                m.setPoster(st.nextToken());
                m.setActor(st.nextToken());
                m.setRegdate(st.nextToken());
                m.setGrade(st.nextToken());
                m.setDirector(st.nextToken());

                list.add(m);
            }
            fis.close();
            br.close();

            // 데이터가 추가되었는지 확인
            /*for (Movie m : list) {
                System.out.println("번호 : " + m.getMno());
                System.out.println("제목 : " + m.getTitle());
            }*/
            // ArrayList단위로 저장 파일 => 계속 활용이 가능하다.
            // 1. 파일 => 파일생성
            File file = new File("/Users/kimheejun/Desktop/test/movie_object.txt");
            //파일 존재 여부 확인
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("파일 생성 완료!!");
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);  // 객체 단위로 저장
            // 닫기
            fos.close();
            oos.close();
            System.out.println("객체 단위 저장 완료!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
