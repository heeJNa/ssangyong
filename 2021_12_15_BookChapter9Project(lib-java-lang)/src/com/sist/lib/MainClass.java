package com.sist.lib;

class Card
{
	String kind;
	int num;
	
	public Card() {
		kind="♠";
		num=1;
	}
	//오버로딩 : 중복 메소드 정의
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
	//Object가 가지고 있는 메소드를 재정의 (오버라이딩:메소드 정의를 변경)
	@Override
	public String toString() {
		return kind +" : " + num;
	}
	
	
}

public class MainClass {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("♣",2);
		System.out.println(c1);
		System.out.println(c2);
		
		//기타
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
