package com.sist.test;

class SutdaCard{
    private int num;
    private boolean isKwang;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if(0<num && num<=10) {
            this.num = num;
        }
    }

    public boolean getIsKwang() {
        return isKwang;
    }

    public void setIsKwang(String kwang) {
        this.isKwang = kwang.equals("광");
    }
}

class Student extends SutdaCard{
    private String name;
    private  int ban;
    private  int no;
    private  int kor;
    private  int eng;
    private  int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}

public class Test1 {
    public static void main(String[] args) {

    }
}
