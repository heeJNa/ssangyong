package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Scanner;

// *** contains() => 문자열 중에 포함되었는지 여부 => LIKE
//원형) public boolean contains(String word) => 자바 스크립트 (SearchBar)
//==> 영화추천 ==> 블로그, 카페에서 입력글을 읽는다. => 실시간 (트위터)
public class MainClass6 {
    public static void main(String[] args) {
        //1.사용자 입력
        Scanner scan = new Scanner(System.in);
        System.out.println("검색어 입력 : ");
        String fd = scan.next();
        //2.찾기 => contains
        try {
            Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
            //사이트에 접근해서 모든데이터를 읽어 와라
            Elements elem = doc.select("div.wrap_song_info a");
            for (int i = 0; i < elem.size(); i++) {
                String ss = elem.get(i).attr("title");  //노래제목
                if (ss.contains(fd)) {  //노래 제목에 입력된 단어 포함된 경우 출력
                    System.out.println(ss);
                }
            }
        } catch (Exception e) {
        }
        //3. 찾기 결과를 보여준다.
    }
}
