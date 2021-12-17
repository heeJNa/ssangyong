package sist.com.basic.obj;

import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> lib;
	Book b ;
	
	public Library() {
		lib = new ArrayList<>();
	}
	public void addBook() {
		b = new Book("harry");
		lib.add(b);
	}
	
	public static void main(String[] args) {
		
	}

}
