package com.sist.lib;
//MessageFormat => �������
import java.util.*;
import java.text.*;

public class MainClass10 {
	public static void main(String[] args) {
		// insert / update
		String msg = "�̸�:{0}\n��ȭ��ȣ:{1}\n�ּ�:{2}\n����:{3}";
		Object[] obj= {"ȫ�浿","010-1111-1234","����","����"};
		String res = MessageFormat.format(msg, obj);
		System.out.println(res);
		
		String pattern ="INSERT INTO Member VALUES({0},''{1}'',''{2}''," 
						+ "''{3}'',''{4}'',{5})";
		Object[] obj2 = {1,"�̼���","����","����","010-1111-1234",25};
		String res2 = MessageFormat.format(pattern, obj2);
		System.out.println(res2);
	}
}
