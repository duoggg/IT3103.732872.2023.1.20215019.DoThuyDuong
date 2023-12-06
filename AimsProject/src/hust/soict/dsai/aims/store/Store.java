package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	public static final int MAX_NUMBERS_ORDERED = 20 ;
	
	private  ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public Store() {
		
	}
	
	public int numberOfItems() {
		return itemsOrdered.size();
	}
	
	// Them DVD
	public void addMedia(Media disc) {
		if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED) System.out.println("The store is almost full !");
		else {
			itemsOrdered.add(disc) ;
			System.out.println("The Media has been added to store ");
		}			
	}
	
	// Xoa DVD
	public void  removeMedia(Media disc) {
		if(itemsOrdered.size() == 0) System.out.println("Nothing in store !");
		else {
			for(Media m : itemsOrdered) {
				if(disc.getTitle().equals(m.getTitle())) {
					
					// Cap nhat lai array itemsOrdered[] 
					itemsOrdered.remove(disc);
					
					// Dua ra thong bao
					System.out.println("The Media has been removed from store !");
					break;
				}
			}
		}	
	}
	
	// Tìm kiếm theo Title
			public Media searchByTitle(String title){
				for(Media m : itemsOrdered){
					if(m.getTitle().equals(title) ) return m;
				}
				
				return null;
			}
	
	// In ra cac DVD co trong Store
	public void printStore(){
		for(Media m : itemsOrdered){
			String type = "";
			if(m instanceof DigitalVideoDisc) {type = "Dis";}
			else if(m instanceof Book) {type = "Book";}
			else if(m instanceof CD) {type = "CD";}
			System.out.println( type + " - " +
							   " Title : " + m.getTitle() + "-" +
							   " Cost : " + m.getCost() 
							   );
		}
		
	}
}
