package com.sist.app2.main;
// client (브라우저) => 사용자가 보는 곳 (Front end)
import java.util.*;
import com.sist.app2.music.*;
public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MusicSystem ms = new MusicSystem();
        int total=ms.musicTotlaPage();
        System.out.print("페이지 입력(1 ~ "+total+"page) : ");
        int page = scan.nextInt();
        //해당 페이지의 값을 받는다
        ArrayList<Music> list = ms.musicListData(page);
        //받은 데이터 출력
        System.out.println("===== "+page+"page 음악 목록 =====");
        for (Music m : list){
            System.out.println(m.getNo()+"."+m.getTitle());
        }
        System.out.println("===== 등폭이 가장 큰 음악 목록 =====");
        list.clear();
        list = ms.musicMaxData();
        for (Music m : list){
            System.out.println(m.getNo()+"."+m.getTitle()
                            +"("+m.getIdcrement()+")");
        }
        System.out.println("===== 제목으로 찾기 =====");
        System.out.print("제목입력 : ");
        String title = scan.next();
        list.clear();
        list = ms.titleFindData(title);
        for (Music m : list){
            System.out.println(m.getNo()+"."+m.getTitle());
        }

        System.out.println("===== 가수명으로 찾기 =====");
        System.out.print("가수명 입력 : ");
        String singer = scan.next();
        list.clear();
        list = ms.singerFindData(singer);
        for (Music m : list){
            System.out.println(m.getNo()+"."+m.getTitle()
                            +"("+m.getSinger()+")");
        }
    }
}
