package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		System.out.println("Do Thuy Duong 20215019");
		
// Test addDVD	
		System.out.println("\nADD Media TO STORE");
		Store store = new Store();
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
						"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		
		
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		
		System.out.println("The numbers of media in cart: " + store.numberOfItems());
		store.printStore();
		
// TEST removeDVD
		System.out.println("\nREMOVE Media FROM STORE");
		store.removeMedia(dvd2);
		System.out.println("The numbers of media in cart: " + store.numberOfItems());
		store.printStore();
	}
}
