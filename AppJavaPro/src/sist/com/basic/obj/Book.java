package sist.com.basic.obj;


public class Book {
	private String bookName;
	private static String author;
	private String publisher;
	private int price;
	private String isbn;
	
	public Book() {
		
	}
	
	public Book(String bookname) {
		this.bookName = bookname;
	}
	
	public Book getInstance() {
		return this;
	}
	
	public Cover getCover() {
		return new Cover();
	}
	
	protected class Cover{	//���� Ŭ����
		
		public void what() {
			System.out.println("shark");
		}
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		author = "������";
		new Book().bookName = "���̽�";
		System.out.println(new Book().bookName); // �� new Book()�� �Ʒ� new Book()�� �ٸ� �ν��Ͻ�
		Book book = new Book();
		book.bookName = "�ڹ�";
		System.out.println(book);
	}
}
