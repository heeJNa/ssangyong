package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// finally => close() , ���� , ���� , �����ͺ��̽�
// try , catch ����� ���þ��� ������ �����ϴ� ����
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
//        try���� ����� �ڵ����� close()�� ȣ��
        catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
