package com.sist.lib;

class Card
{
	String kind;
	int num;
	
	public Card() {
		kind="��";
		num=1;
	}
	//�����ε� : �ߺ� �޼ҵ� ����
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
	//Object�� ������ �ִ� �޼ҵ带 ������ (�������̵�:�޼ҵ� ���Ǹ� ����)
	@Override
	public String toString() {
		return kind +" : " + num;
	}
	
	
}

public class MainClass {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("��",2);
		System.out.println(c1);
		System.out.println(c2);
		
		//��Ÿ
		Class c3 = c1.getClass();
		System.out.println(c3);
		try {
			Class c4 = Class.forName("com.sist.lib.Card");
			System.out.println(c4);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
