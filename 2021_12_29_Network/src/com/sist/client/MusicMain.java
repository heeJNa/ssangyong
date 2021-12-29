package com.sist.client;
// 윈도우 => HTML
import com.sist.common.Function;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//네트워크
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class MusicMain extends JFrame implements Runnable, ActionListener{
    CardLayout card = new CardLayout();
    Login login = new Login();
    MusicView musicView = new MusicView();
    // 네트워크 관련된 클래스
    Socket s; // 연결 기기(전화기)
    // 송신, 수신 => IO
    OutputStream out;
    BufferedReader in;
    public MusicMain(){
        setLayout(card); //BorderLayout=> 변경
        // 화면 => 모아둔다 =>
        /*
        *       Login => 서버 연결
        *       Music => 음악 목록, 음악 찾기
        * */
        add("Login",login);
        add("MusicView",musicView);
        // 크기 결정
        setSize(800,600);
        // 윈도우 보여달라
        setVisible(true);
        // 종료버튼 클릭시 윈도우 해제
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //버튼 클릭시 => 등록 해야 => 자동으로 호출 (CallBack)
        login.b1.addActionListener(this); // 로그인
        login.b2.addActionListener(this); // 취소
        musicView.b1.addActionListener(this); // 검색
        musicView.b2.addActionListener(this); // 목록

    }

    public static void main(String[] args) {new MusicMain();}

    // 버튼 클릭시 처리
    @Override
    public void actionPerformed(ActionEvent e) {
        // 사용자 요청
        if (e.getSource()==login.b1){
            // 서버와 연결
            // ID읽기
            String id = login.tf1.getText();
            if(id.length()<1){ // 입력이 안된 경우
                JOptionPane.showMessageDialog(this,"아이디를 입력");
                login.tf1.requestFocus();
                return;
            }
            // 이름읽기
            String name = login.tf2.getText();
            if(id.length()<1){ // 입력이 안된 경우
                JOptionPane.showMessageDialog(this,"이름을 입력");
                login.tf2.requestFocus();
                return;
            }
            // 서버와 연결
            try {
                s = new Socket("localhost",3355); //서버와 연결
                // Socket("서버주소(IP)", 서버에서 설정된 PORT)
                // 송수신 위치 확인
                out = s.getOutputStream();// 서버로 데이터를 전송
                in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                /*
                *       클라이언트 : Socket (서버 정보) => 서버IP
                *       서버 : Socket (클라이언트) => 클라이언트IP
                * */
                // 로그인 요청
                out.write((Function.LOGIN+"|"+id+"|"+name+"\n").getBytes());
                // ID, 이름 => Login을 요청
                // 서버에서 들어오는 데이터를 받아서 출력한다
                new Thread(this).start();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            // ID, 이름 => Login을 요청
        } else if (e.getSource()==login.b2){
            // 취소 => 프로그램 종료
            System.exit(0); // 0 => 정상 종료
        } else if (e.getSource()==musicView.b1){
            // 검색어를 읽어서 검색된 내용을 찾아 달라 요청
            String ss = musicView.tf.getText(); // 입력한 문자열을 읽어옴
            if(ss.length()<1){
                JOptionPane.showMessageDialog(this,"검색어 입력");
                musicView.tf.requestFocus();
                return;
            }
            try {
                out.write((Function.FIND+"|"+ss+"\n").getBytes());
            }catch (Exception ex){
                musicView.tf.setText("");
                ex.printStackTrace();
            }
        } else if (e.getSource()==musicView.b2){
            // 전체 목록 요청
            try {
                out.write((Function.LIST+"|\n").getBytes());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    // 서버에서 보내준 데이터 출력
    // switch => 네트워크, 윈도우, 게임
    // 웹 => if를 주로 사용 (별점 처리) => 리뷰, 맛집, 여행 코스
    @Override
    public void run() {
        try {
            while(true){
                //서버로부터 데이터 받기
                String msg = in.readLine();
                System.out.println("Server =>" +msg);
                // 구분
                StringTokenizer st = new StringTokenizer(msg,"|");
                int protocol = Integer.parseInt(st.nextToken());
                // Function.MYLOG, Function.LIST, Funtion.FIND
                switch (protocol){
                    case Function.MYLOG :{
                        card.show(getContentPane(),"MusicView");
                        setTitle(st.nextToken());
                    }
                    break;
                    case Function.LIST:{
                        // 테이블 내용을 지우고 다시 채운다
                        for(int i = musicView.model.getRowCount()-1;i>=0;i--){ //밑에서 부터 해야함
                            musicView.model.removeRow(i);
                        }
                        String data = st.nextToken();
                        String[] music = data.split("\\^");
                        for (String m:music){
                            String[] mdata = m.split("%");
                            musicView.model.addRow(mdata);
                        }
                    }
                    break;
                    case Function.FIND:{
                        for(int i = musicView.model.getRowCount()-1;i>=0;i--){ //밑에서 부터 해야함
                            musicView.model.removeRow(i);
                        }
                        String data = st.nextToken();
                        String[] music = data.split("\\^");
                        for (String m:music){
                            String[] mdata = m.split("%");
                            musicView.model.addRow(mdata);
                        }
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
