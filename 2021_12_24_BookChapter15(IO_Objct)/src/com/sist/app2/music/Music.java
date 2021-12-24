package com.sist.app2.music;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// Music 데이터 수집
// 공통으로 사용하는 데이터 형 (사용자 정의)
// 음악 1개에 대한 정보를 담고 있다.
@Setter
@Getter
public class Music implements Serializable {
    private int no; //rank, no
    private int idcrement; // increment,decrement
    private String state; //유지 - , 상승, 하강
    private String title;
    private String singer;
    private String album;
}
