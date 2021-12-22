package com.sist.ann;

import java.util.ArrayList;

public class MainClass3 {
    @Deprecated //권장하지 않는 메소드
    public  void aaa(){

    }
    public static void main(String[] args) {
        try{
            Class clsName = Class.forName("java.util.ArrayList");
            Object obj = clsName.getDeclaredConstructor().newInstance();    //리턴형이 Object
            ArrayList<String> list =(ArrayList<String>) obj;
            list.add("홍길동");
            list.add("심청이");
            for(String s : list){
                System.out.println(s);
            }
        }catch(Exception e){

        }
    }
}
