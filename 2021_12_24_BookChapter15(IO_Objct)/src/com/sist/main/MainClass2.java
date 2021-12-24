package com.sist.main;
// FileReader / FileWriter => 한글이 있는 데이터 읽거나, 파일에 저장
// 한글 => 2byte => 한글자(2byte) => 문자 기반 스트림
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.*;

@Getter
@Setter
// 한명(개)에 대한 정보 => new를 이용해서 생성
// MemberVO, MemberDTO (한명에 대한 정보를 모아서 전송 목적)
// JSP => MemberBean
/*
*       클래스 : 프로그램
*       1. 데이터를 모아 둔다 (VO,DTO) : 변수
*
*
* */
class Member{
    private int no;
    private String name;
    private String sex;
    private String addr;
    private String tel;

    public Member(int no, String name, String sex, String addr, String tel) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.addr = addr;
        this.tel = tel;
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        // => 오라클/웹/Open Api
        ArrayList<Member> list = new ArrayList<>();
        list.add(new Member(1,"홍길동","남자","서울","010-1111-1111"));
        list.add(new Member(2,"이순신","남자","부산","010-2222-2222"));
        list.add(new Member(3,"춘향이","여자","제주","010-3333-3333"));
        list.add(new Member(4,"소서노","여자","광주","010-4444-4444"));
        list.add(new Member(5,"강감찬","남자","인천","010-5555-5555"));

        try {
            StringBuffer sb = new StringBuffer();
            File file = new File("/Users/kimheejun/Desktop/test/addr.txt");
            // 파일 쓰기 => 존재 여부 확인(없는 경우 : 파일 생성, 있는 경우 : 통과)
            if(!file.exists()){ // 파일이 있는지 확인
                file.createNewFile();
                System.out.println("파일 생성 완료!!");
            }
            FileWriter fw = new FileWriter(file);
            for (Member m :list) {
                String data = m.getNo() + "|"
                            +m.getName()+"|"
                            +m.getSex()+"|"
                            +m.getAddr()+"|"
                            +m.getTel()+"\n";
                sb.append(data);
            }
            fw.write(sb.toString()); //sb에 저장된 모든 데이터에 출력
            fw.close(); //파일 닫기
            System.out.println("회원 목록 저장 완료!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
