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
	
	protected class Cover{	//내부 클래스
		
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
		author = "김희준";
		new Book().bookName = "파이썬";
		System.out.println(new Book().bookName); // 위 new Book()과 아래 new Book()은 다른 인스턴스
		Book book = new Book();
		book.bookName = "자바";
		System.out.println(book);
	}
}
