package com.sist.lib;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		//1. �Է��� �޴´�.
		Scanner scan = new Scanner(System.in);
		System.out.println("ID�� Password �Է� : ");
		String id = scan.next();
		String pwd = scan.next();
		System.out.println("ID : "+id);
		System.out.println("Password : "+pwd);
		//2. ID,PWD�� ���Ѵ�.
		// ����Ŭ�� ����� ������
		final String myId= "admin";
		final String myPwd = "1234";
		//3. ����� ���
		//��ø if
		//equals ==> ��ҹ��ڸ� �����ؼ� ��
		if(myId.equals(id)) {
			if(myPwd.equals(pwd)) {	//��й�ȣ �˻�
					System.out.println(id+"�� �α��εǾ����ϴ�.");
			}else {
				System.out.println("��й�ȣ�� Ʋ���ϴ�!!");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�!!");
		}
	}
}








