package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.*;
import java.io.*;
import java.net.*;
public class NewsSystem {
    public static void main(String[] args) {
        NewsSystem ns = new NewsSystem();
        ns.newsGetData("축구");
    }
    // 1. 뉴스를 읽어와서 => 파일
    public void newsGetData(String fd){
        // fd => 사용자가 보내준 검색어 (find_data)
        // 1. 사이트 접근
        try {
            String strUrl="http://newssearch.naver.com/search.naver?where=rss"
                            +"&query="
                            +URLEncoder.encode(fd,"UTF-8");
            Document doc = Jsoup.connect(strUrl).get();
//            System.out.println(doc);
            Elements title = doc.select("rss channel item title");  //50
            Elements desc = doc.select("rss channel item description"); //50
            Elements author = doc.select("rss channel item author");    //50

        // 2. 데이터를 읽어서 News의 종류별 제어
            StringBuffer sb = new StringBuffer();
            for (int i =0;i<title.size();i++){
                /*System.out.println(title.get(i).text());
                System.out.println(desc.get(i).text());
                System.out.println(author.get(i).text());
                System.out.println("=============================================");*/
                String msg=title.get(i).text()+"|"+desc.get(i).text()+"|"+author.get(i).text()+"\n";
                sb.append(msg);
            }
            //저장된 내용을 파일에 저장
            FileWriter fw = new FileWriter("/Users/kimheejun/Desktop/test/naver_news.txt");
            fw.write(sb.toString());
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // 2. 뉴스를 사용자에게 보낸다.
    public ArrayList<News> newsAllData(){
        ArrayList<News> list = new ArrayList<>();
        //파일을 읽어서 데이터 전송
        try {
            FileInputStream fis = new FileInputStream("/Users/kimheejun/Desktop/test/naver_news.txt");
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(fis));
            while(true){
                String data = br.readLine(); // \n까지 읽는다.
                if (data==null) break;  // 읽을 데이터가 없는 경우 종료
                StringTokenizer st =
                        new StringTokenizer(data,"|");
                News news = new News();
                news.setTitle(st.nextToken());
                news.setDescription(st.nextToken());
                news.setAuthor(st.nextToken());
                list.add(news);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
