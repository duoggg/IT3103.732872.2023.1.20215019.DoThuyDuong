package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public void addAuthor(String name) {
		if(!authors.contains(name)) {
			authors.add(name);
			System.out.println("Add author");
			
		}else {
			System.out.println("Author has already been added !");
		}
		
	}
	
	public void removeAuthor(String name) {
		if(authors.contains(name)) {
			authors.remove(name) ;
			System.out.println("Remove author");
		}else {
			System.out.println("Author not existed !");
		}
	}
	
	public void printAuthors() {
		System.out.println(authors);
	}
	
	public static void main(String[] args) {
		Book newBook = new Book();
		newBook.addAuthor("hi");
		newBook.addAuthor("bye");
		newBook.removeAuthor("bye");
		newBook.printAuthors();
		
	}
	
	
}
