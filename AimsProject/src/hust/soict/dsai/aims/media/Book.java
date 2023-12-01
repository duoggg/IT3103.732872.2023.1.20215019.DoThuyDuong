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
		}
	}
	
	public void removeAuthor(String name) {
		if(authors.contains(name)) {
			authors.remove(name) ;
		}
	}
	
	
	
}
