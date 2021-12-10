package sist.com.basic2.obj;

public class Node { // ΩÃ±€≈Ê∆–≈œ
	static Node node = null;
	private int dataValue;

	public void setDataValue(int dataValue) {
		this.dataValue = dataValue;
	}

	public int getDataValue() {
		return this.dataValue;
	}

	public static Node getInstance() {
		if (node == null) {
			node = new Node();
		}
		return node;
	}

	private Node() {
		dataValue = 0;
	}

	public static void main(String[] args) {
		Node.getInstance().setDataValue(50);
		System.out.println(Node.getInstance().getDataValue());
	}

}