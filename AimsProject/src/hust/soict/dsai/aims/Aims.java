package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.menu.MainMenu;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	public static Cart Order = new Cart();
	public static Store Store = new Store();
	
	public static void initData(){

        // Book
        Book book1 = new Book("The Great Novel", 100.00f);
        // DVD
        DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
 				"Roger Allers", 87, 19.95f );
        DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
	 		"George Lucas", 87, 24.95f );
        DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );

        // CD
        CD cd1 = new CD("After you",1.82f);
        CD cd2 = new CD("Before you",1.94f);
        
        Store.addMedia(book1);
        Store.addMedia(dvd1);
        Store.addMedia(dvd2);
        Store.addMedia(dvd3);
        Store.addMedia(cd1);
        Store.addMedia(cd2);
    }
	
	public static void main(String[] args) {
		initData();
		boolean k = true ;
		while(k) {
			MainMenu.showMenu(); 
			MainMenu menu = new MainMenu();
			k = menu.selectOption() ;
		}
	}
}
