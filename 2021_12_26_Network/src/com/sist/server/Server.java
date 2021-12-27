package com.sist.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    private ServerSocket ss =null;
    private final int PORT=3355; // 0~655355 => (0~1023사용중인 포트)
    // 1521, 8080, 3000,      1433,  4000
    // 오라클, 프록시,react,vue  ms=sal, 머드서버
    // 일반 (문자 중심 : 10000대 이하), 음석(20000), 화상(30000)
    public Server() {
        try {
            // 서버구동은 두번할 수 없다 (한번만 실행이 가능)
            ss = new ServerSocket(PORT);
            // 1. bind ==> ip와 포트연결 ==> 핸드폰 개통(유심)
//                    ip : 전화번호
//                    port : 전화선
            // 2. listen  ===> 대기
            // 3. Socket ==> 전화
            System.out.println("서버구동 완료!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        //서버 동작 => 접속시 처리
        while(true){ // 서버구동을 계속적으로 수행
            try {
                Socket s = ss.accept(); // 접속이 된 상태 => 발신자 전화번호
                // 확인 => 컴퓨터의 ip를 출력
                System.out.println(s.getInetAddress().getHostAddress());
                System.out.println(s.getPort()); // 어떤 라인선을 통해서 접근했는지 확인
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server s = new Server();
        new Thread(s).start();
    }
}
