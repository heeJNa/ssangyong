package com.sist.app2.music;

import java.io.Serializable;

// 객체 단위로 저장 ==> 저장 (직렬화)
public class Music implements Serializable {
    private int no; //rank, no
    private int idcrement; // increment,decrement
    private String state; //유지 - , 상승, 하강
    private String title;
    private String singer;
    private String album;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getIdcrement() {
        return idcrement;
    }

    public void setIdcrement(int idcrement) {
        this.idcrement = idcrement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
