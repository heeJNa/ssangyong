package com.sist.app2.music;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 사용자 요청 => 처리후 응답
public class MusicSystem {
    // 음악 정보 ==> 전체를 가지고 있다 (공유) => static
    // 음악 1 (Music), 음악 전체 (ArrayList<Music>)
    static private ArrayList<Music> list = new ArrayList<>();
    //초기화 => ArrayList에 값을 채운다
    static {
        try {
            //파일에 읽는다 => 객체단위로 변환 => ArrayList대입
            FileInputStream fis = new FileInputStream("/Users/kimheejun/Desktop/test/music_object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Music>) ois.readObject();
            //파일 닫기
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // 사용자 요청 처리
    // 목록 요청
    public ArrayList<Music> musicListData(int page){
        ArrayList<Music> mList = new ArrayList<>();
        int j = 0;  //10개씩 잘라주는 변수
        // 실전에 필요한 제어문 ==> 페이징 기법 => 오라클(인라인뷰)
        int pagecnt=(page*10)-10;   //시작번호, list에는 0부터 들어가 있다
        /*
        *       1page ==> 0~9
        *       2page ==> 10~19
        *       3page ==> 20~29
        * */
        for(int i =0;i< list.size();i++){
            Music m = list.get(i);
            if(j<10 && i>=pagecnt){
                mList.add(m);
                j++;
            }
            if (j==10) break;
        }
        return mList;
    }

    public int musicTotlaPage(){
        return (int)(Math.ceil(list.size())/10.0);
        // 총페이지를 구할때 => 올림메소드를 이용한다 => ceil()
    }
    // 제목으로 찾기 요청
    public ArrayList<Music> titleFindData(String title){
        ArrayList<Music> mList = new ArrayList<>();
        for (Music m : list){
            if (m.getTitle().contains(title)){
                mList.add(m);
            }
        }
        return mList;
    }
    // 등폭이 가장 많은 음악
    public ArrayList<Music> musicMaxData(){
        ArrayList<Music> mList = new ArrayList<>();
        int max = 0;
        for (Music m : list){
            if(max<m.getIdcrement())
                max=m.getIdcrement();
        }
        for(Music m : list){
            if(m.getIdcrement()==max){
                mList.add(m);
            }
        }
        return mList;
    }
    // 가수명으로 찾기
    public ArrayList<Music> singerFindData(String singer){
        ArrayList<Music> sList = new ArrayList<>();
        for (Music m : list){
            if (m.getSinger().contains(singer)){
                sList.add(m);
            }
        }
        return sList;
    }
    // 상세보기
    public Music musicDetailData(int no){ //번호 1부터 시작
        return list.get(no-1);
    }
}
