package com.sist.lib;

import java.util.Random;
import java.util.Scanner;

public class MainClass4 {
	public static void main(String[] args) {
		//1. ������ �� ���� => ���� => Random ==>1~100
		Random r = new Random();
		int com = r.nextInt(100)+1; //0~99 => 1~100
		int count =0;
		System.out.println("UPDOWN ������ �����մϴ�");
		
		Scanner scan = new Scanner(System.in);
		while(true) {	//�ݺ�Ƚ���� �𸣴� ��� => ���ѷ���
			//����� �Է�
			System.out.print("1~100 ������ ���� �Է� : ");
			int user = scan.nextInt();
			//1~100�� �ƴ� ���
			if(user<1 || user >100) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
				/*
				 * while ==> ���ǽ����� �̵�
				 * for ==> ���������� �̵�
				*/
			}
			count++;
			//��Ʈ
			if(com>user) {
				System.out.println("UP");
			}else if(com <user) {
				System.out.println("DOWN");
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println("���� : "+count);
				break;
			}
			//���� ���� => ����
		}
	}
}
