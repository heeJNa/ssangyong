package com.sist.main;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;

// Object단위로 저장
// Object단위로 읽기
/*
*       지원하는 클래스
*           ObjectInputStream ==> Object readObject(), close()
*           ObjectOutputStream ==> void writeObject(Object obj), close()
*
*      ======
*       홍길동
*      ======      직렬화  writeObject(Object obj)
*       남자        ===>   =================
*                  <===    홍길동 | 남자 | 25
*                  역직렬화 ================= Object readObject()
*      ======
*       25
*      ======
*
* */
@Setter
@Getter
// implements Serializable : 직렬화로 저장 요청
class Sawon implements Serializable {
    private int sabun;
    private String name;
    private String dept;
    private String loc;
    private int pay;

    public Sawon() {
    }

    public Sawon(int sabun, String name, String dept, String loc, int pay) {
        this.sabun = sabun;
        this.name = name;
        this.dept = dept;
        this.loc = loc;
        this.pay = pay;
    }
}
public class MainClass5 {
    public static void main(String[] args) {
        // 저장 공간 ArrayList => 데이터를 저장 => 통째로 파일에 저장
        ArrayList<Sawon> list = new ArrayList<>();
        list.add(new Sawon(1,"홍길동","개발부","부산",3000));
        list.add(new Sawon(2,"박문수","영엽부","서울",7000));
        list.add(new Sawon(3,"강감찬","자재부","강원",8000));
        list.add(new Sawon(4,"이순신","기획부","인천",3500));
        list.add(new Sawon(5,"김두한","총무부","경기",4000));

        try {
            // 파일 만들기
            File file = new File("/Users/kimheejun/Desktop/test/sawon.txt");
            //파일 존재 여부 확인
            if(!file.exists()){
                file.createNewFile();
                System.out.println("파일 생성 완료!!");
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // 파일을 읽어 온다
            // 파일에 ArrayList를 저장
            oos.writeObject(list);
            fos.close();
            oos.close();
            System.out.println("객체 단위 저장 완료!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
