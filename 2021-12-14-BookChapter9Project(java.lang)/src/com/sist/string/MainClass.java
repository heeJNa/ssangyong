package com.sist.string;

class Sawon /*extends Object*/{
    private String name;

    public Sawon(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("이름 : " + name);
    }

    @Override
    public String toString() {
        return "Sawon이 가지고 있는 이름은 " + name + "입니다.";
    }

    //메모리 해제
    //객체의 메모리에서 사라질때 자동호출되는 메소드(소멸자)
    @Override
    protected void finalize() throws Throwable {    //소멸자 함수
        System.out.println("Sawon 객체 메모리 해제...");

    }
}

public class MainClass {


    public static void main(String[] args) {
        //사원 기능 사용
        //1. 메모리에 저장
        Sawon s = new Sawon("홍길동");
        System.out.println(s.toString());
        //2. 활용
        s.print();
        //3.메모리 해제 => s=null (GC)
        s=null; //사용하지 않는다
        //4. 직접 해제
        System.gc();    //가비지컬렉션 호출 (메모리에서 사용하지 않거나 , null일때 회수)
        //finalize()가 호출되면 메모리에서 제거

    }
}
