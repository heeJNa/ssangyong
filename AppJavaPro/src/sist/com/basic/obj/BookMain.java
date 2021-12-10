package sist.com.basic.obj;

import sist.com.basic.obj.Book.Cover;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(5000);
		System.out.println(book.getPrice());
		
		Cover bc;
		bc = book.getCover();
		bc.what();
		
		Book b = new Book();
		b.getInstance().setPrice(3000);
		System.out.println(b.getPrice());
		
		
	}

}
