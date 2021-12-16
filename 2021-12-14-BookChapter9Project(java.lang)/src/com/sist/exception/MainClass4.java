package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// finally => close() , 파일 , 서버 , 데이터베이스
// try , catch 수행과 관련없이 무조건 수행하는 문장
public class MainClass4 {

    /*public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/kimheejun/movie.txt");
        int i = 0;
        while((i=fr.read()) != -1){
            System.out.print((char) i);
        }
        fr.close();
    }*/
    /*public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/kimheejun/movie.txt");
        int i = 0;
        while((i=fr.read()) != -1){
            System.out.print((char) i);
        }
        } catch (FileNotFoundException e) {}
        catch (IOException e) {}
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/Users/kimheejun/")) {
            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }
//        try블럭을 벗어나면 자동으로 close()가 호출
        catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
