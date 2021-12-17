package com.sist.lib;
//MessageFormat => 출력형식
import java.util.*;
import java.text.*;

public class MainClass10 {
	public static void main(String[] args) {
		// insert / update
		String msg = "이름:{0}\n전화번호:{1}\n주소:{2}\n성별:{3}";
		Object[] obj= {"홍길동","010-1111-1234","서울","남자"};
		String res = MessageFormat.format(msg, obj);
		System.out.println(res);
		
		String pattern ="INSERT INTO Member VALUES({0},''{1}'',''{2}''," 
						+ "''{3}'',''{4}'',{5})";
		Object[] obj2 = {1,"이순신","남자","서울","010-1111-1234",25};
		String res2 = MessageFormat.format(pattern, obj2);
		System.out.println(res2);
	}
}
