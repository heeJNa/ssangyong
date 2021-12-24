package com.sist.app2.temp;
// 임시 => 데이터 수집 => 파일 or 오라클에 저장
// 1. 데이터 수집
// 2. ArrayList에 대입
// 3. ArrayList를 파일에 저장

import java.util.*;
import java.io.*;

import com.sist.app2.music.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.*;

// 패키지가 다르면 => import를 이용해서 필요한 클래스를 읽어 온다
/*
        <tr class="list" songid="82146674">
            <td class="check"><input type="checkbox" class="select-check" title="All I Want for Christmas Is You"></td>   여기는 checkbox
            <td class="number">1

                <span class="rank">
                    <span class="rank"><span class="rank-none"><span class="hide">유지</span></span></span>
                </span>
            </td>
            <td><a href="#" class="cover" onclick="fnViewAlbumLayer('80384589');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/080/384/589/80384589_1572569104266_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Merry Christmas (Deluxe Anniversary Edition)"></a></td>
            <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('82146674');return false;">곡 제목 정보 페이지</a></td>
            <td class="info">
                <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('82146674','1');return false;">
                    All I Want for Christmas Is You</a>
                    <a href="#" class="artist ellipsis" onclick="fnViewArtist('14937308');return false;">Mariah Carey</a>

                <i class="bar">|</i>
                <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('80384589');return false;">Merry Christmas (Deluxe Anniversary Edition)</a>
            </td>
                <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('82146674;' ,'1'); return false;">듣기</a></td>
                <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('82146674;' ,'3'); return false;">재생목록에 추가</a></td>
            <td class="btns"><button type="button" class="btn-basic btn-album" songid="82146674" id="add_my_album_82146674" onclick="fnAddMyAlbumForm('#add_my_album_82146674' , '82146674' ,10, 10);return false;">플레이리스트에 담기</button></td>
                <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('82146674');return false;">다운로드</a></td>
            <td class="btns">
                <div class="toggle-button-box lyr-mv" id="list-mv_82146674">
                    <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="All I Want for Christmas Is You" onclick="fnPlayMv('82146674','3'); return false;">뮤직비디오 보기</a>
                </div>
            </td>
            <td class="more">
                <div class="toggle-button-box">
                    <button type="button" class="btn btn-basic btn-more">더보기</button>
                    <ul class="list">
                        <li><a href="#" class="item" title="공유" onclick="shareDo('82146674');return false;">공유하기/음악나누기</a></li>
                        <li><a href="#" class="item" title="선물" onclick="fnGiftSong('82146674');return false;">선물하기</a></li>
                    </ul>
                </div>
            </td>
        </tr>
 */
public class MusicMain {
    public static void main(String[] args) {
        // 데이터를 웹에서 읽기
        ArrayList<Music> list = new ArrayList<>();
        try {
            // 사이트의 데이터 읽기 => https://www.genie.co.kr/chart/top200?ditc=D&ymd=20211224&hh=14&rtm=Y&pg=1
            int k = 1;
            for (int i = 1; i <= 4; i++) {
                // <a>
                Document doc =
                        Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20211224&hh=14&rtm=Y&pg=" + i).get(); // 사이트에 있는 데이터 읽기
                Elements title = doc.select("td.info a.title");
                Elements singer = doc.select("td.info a.artist");
                Elements album = doc.select("td.info a.albumtitle");
                Elements etc = doc.select("span.rank");

                for (int j = 0; j < title.size(); j++) {
                    try {
                        System.out.println(k);
                        System.out.println(title.get(j).text());
                        System.out.println(singer.get(j).text());
                        System.out.println(album.get(j).text());
                        String temp = etc.get(j).text();
                        String state = temp.replaceAll("[^가-힣]", "");
                        String id = temp.replaceAll("[^0-9]", "");
                        if (state.equals("유지") || state.equals("")) {   // etc가 new인것들은 state가 ""이 된다.
                            id = "0";   // 등폭이 없다
                        }
                        System.out.println("등폭:" + id);
                        System.out.println("상태:" + state);
                        System.out.println("\n");

                        // ArrayList에 저장
                        Music m = new Music();
                        m.setNo(k);
                        m.setTitle(title.get(j).text());
                        m.setSinger(singer.get(j).text());
                        m.setAlbum(album.get(j).text());
                        m.setState(state);
                        m.setIdcrement(Integer.parseInt(id));
                        list.add(m);
                        k++;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            }
            // 객체 단위 저장
            FileOutputStream fos =
                    new FileOutputStream("/Users/kimheejun/Desktop/test/music_object.txt");
            // 파일 자동 생성이 된다
            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);
            oos.writeObject(list);
            // 닫기
            fos.close();
            oos.close();
            System.out.println("파일 저장 완료!!");
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
