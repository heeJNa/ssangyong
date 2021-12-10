package sist.com.basic.obj.inheritance;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick();
		System.out.println(c);

		d.suffle();
		c = d.pick(0);
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card charArr[] = new Card[CARD_NUM];

	public Deck() {
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 0; n < Card.NUM_MAX; n++) {
				charArr[i++] = new Card(k, n + 1);
			}
		}
	}

	Card pick(int index) {
		return charArr[index];
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return charArr[index];
	}

	void suffle() {
		for (int i = 0; i < charArr.length; i++) {
			int j = (int) (Math.random() * CARD_NUM);

			Card temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
		}
	}

}

class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드수

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	public Card() {
		this(SPADE, 1);
	}

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		
		return "Kind : " + kinds[this.kind] + ", number : "+numbers.charAt(number);
	}

}
