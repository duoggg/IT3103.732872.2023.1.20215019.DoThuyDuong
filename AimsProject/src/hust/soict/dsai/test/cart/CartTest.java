package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
						"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		

		anOrder.addMedia(dvd1, dvd2 , dvd3);
		
// Test Print method		
		anOrder.print();
		
// Test Search Method 
		
		// Search by id
		int idSearch = 1 ;
		System.out.printf("Search by Id = %d\n", + idSearch);
		DigitalVideoDisc dvdSearchId = (DigitalVideoDisc) anOrder.searchById(idSearch);
		if(dvdSearchId != null) System.out.printf("%s\n", dvdSearchId.toString());
		else System.out.println("Can't found this DVD\n");
		
		// Search by Title
		String titleSearch = "Star Wars";
		System.out.printf("Search by Title = %s\n", titleSearch);
		DigitalVideoDisc dvdSearchTitle = (DigitalVideoDisc) anOrder.searchByTitle(titleSearch);
		if(dvdSearchTitle != null) System.out.printf("%s", dvdSearchTitle.toString());
		else System.out.println("Can't found this DVD\n");
	}
		
}




