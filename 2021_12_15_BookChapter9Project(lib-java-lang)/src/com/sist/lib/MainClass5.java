package com.sist.lib;
//length()	 => ������ ���� Ȯ��

public class MainClass5 {
	public static void main(String[] args) {
		String[] movie = { "�����̴���: �� ���� Ȩ",
							"��ü��Ż��",
							"�� �� ��",
							"��ĭ��: ������ ����",
							"���� ���� �θǽ�",
							"�α� �� ������",
							"Ƽź	",
							"���� ��������Դϴ�",
							"�帣�� �θǽ�",
							"��Ÿ¥" 
					};
		//1. ��ü ���
		for(String title: movie) {
			System.out.println(title);
		}
		System.out.println("=====================");
		//length => ����Ȯ��
		for(String title : movie) {
			if(title.length()>7) {
				title = title.substring(0,7)+"...";
			}
			System.out.println(title);
		}
	}
}
