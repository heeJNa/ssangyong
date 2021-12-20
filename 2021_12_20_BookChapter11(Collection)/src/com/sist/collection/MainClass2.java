package com.sist.collection;

import java.util.Vector;

/*
        vector : ArratList가 나오기전에 많이 사용된 컬렉션
                 쓰레드 이용해서 데이터 저장(동기)
                 네트워크 서버의 사용자 정보를 저장(ip, port)
        List 인터페이스를 구현
            메소드는 => ArrayList와 동일
            추가 => add(Object obj), addElement(Object obj)
            삭제 => remove(int index), removeElement(int index)
            수정 => set(int index, Object obj)
            데이터 갯수 읽기 => size()
            읽기 => get(int index), elementAt(int index)
            전체 삭제 => clear()
            데이터 유무 확인 => isEmpty()
 */
public class MainClass2 {
    public static void main(String[] args) {
        //저장 공간 생성 (자료구조 => 메모리에 데이터를 저장하고 관리)
        //stack(LIFO) / Queue(FIFO)를 만들어라 (코테)
        //index = 0,   index = length -1
        //index = 0,   index = 0
        Vector<String> vec = new Vector<>();
        //Vector waitVc = new Vector()  //대기실
        //Vector roomVc = new Vector()  //방정보
        //vector userVc = new Vector()  //방안에 있는 사람 정보
        //데이터 추가
        vec.add("홍길동");
        vec.addElement("심청이");
        vec.add("박문수");
        vec.addElement("이순신");
        vec.add("강감찬");
        //추가된 데이터 출력
        System.out.println("저장된 인원수 : " +vec.size());
        for (int i = 0; i<vec.size();i++){
            String name = vec.elementAt(i);
            System.out.println(i + "."+name);
        }
        System.out.println("====== 삭제후 ======");
        vec.removeElementAt(2); //vec.remove(2);
        System.out.println("저장된 인원수 : " +vec.size());
        for (int i = 0; i<vec.size();i++){
            String name = vec.elementAt(i);
            System.out.println(i + "."+name);
        }
        System.out.println("====== 수정후 ======");
        vec.set(3,"을지문덕");
        System.out.println("저장된 인원수 : " +vec.size());
        for (int i = 0; i<vec.size();i++){
            String name = vec.elementAt(i);
            System.out.println(i + "."+name);
        }
        System.out.println("====== 수정후 ======");
        vec.clear();
        System.out.println("저장된 인원수 : " +vec.size());
        if(vec.isEmpty()){
            System.out.println("인원이 없습니다!");
        }
    }
}
