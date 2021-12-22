package com.sist.exception;

// 폴더 => 파일 제작 ==> IO => 자바에서 제공하는 라이브러리는 대부분 예외처리
// 선언 (알림) => throws , 직접처리 => try~catch
import java.io.File;
import java.io.IOException;

/**   io (input/output)
*    => 메모리 입출력
*    => 파일 입출력
*    => 네트워크 입출력
==> 433page*/
public class MainClass3 {
    public static void main(String[] args) {
        File dir = new File("/Users/kimheejun/");
        if (!dir.exists()){
            dir.mkdir();
        }
        File file = new File("/Users/kimheejun/text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();//예외처리가 필요한 메소드
            } catch (IOException e) {
                System.out.println("생성 완료!!");
                // 삭제
                file.delete();
                dir.delete();
                System.out.println("삭제 완료!!");
            }
        }
    }
}
