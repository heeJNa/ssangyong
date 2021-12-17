package sist.com.variable.basic;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listArgument = new ArrayList<>();
        ArrayList<String> arrList = new ArrayList<>();
       
      
        
        listArgument.add("yaboong");
        listArgument.add("github");
        print(listArgument);
        
    }

    private static void print(List<String> listParam) {
        String value = listParam.get(0);
        listParam.add("io");
        System.out.println(value);
    }
}