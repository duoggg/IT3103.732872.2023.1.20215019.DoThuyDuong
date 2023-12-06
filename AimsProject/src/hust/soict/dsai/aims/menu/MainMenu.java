package hust.soict.dsai.aims.menu;

import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.menu.cart.CartMenu;
import hust.soict.dsai.aims.menu.store.StoreMenu;

public class MainMenu {
	private static Scanner sc = new Scanner(System.in);
	/// SHOW MENU 
		public static void showMenu() {
	        System.out.println("\nAIMS: ");
	        System.out.println("--------------------------------");
	        System.out.println("1. View store");
	        System.out.println("2. Update store");
	        System.out.println("3. See current cart");
	        System.out.println("0. Exit");
	        System.out.println("--------------------------------");
	        System.out.println("Please choose a number: 0-1-2-3");
	    }
		
	//// OPTION 
		public boolean selectOption() {
			int opt = sc.nextInt() ;
			switch(opt) {
				case 0 : 	return false ;
				case 1 :
							boolean k1 = true ;
							while(k1) {
								StoreMenu.storeMenu();
								StoreMenu storemenu = new StoreMenu();
								k1 = storemenu.selectOption() ;
								System.out.println("");
							}
	
							break ;
				case 2 :
							UpdateStore() ;
							break ;
				case 3 :
							boolean k3 = true ;
							while(k3) {
								CartMenu.cartMenu();
								CartMenu cartmenu = new CartMenu();
								k3 = cartmenu.selectOption() ;
								System.out.println("");
							}
							break ;
				default : 
							System.out.println("Wrong Option!");
							break ;
			}
			return true ;
		}
		
		public void UpdateStore() {
			System.out.println("Do you want to add item to store ? (1: Yes, 0: No): ");
			int t = sc.nextInt() ;
			if (t == 1) {
				System.out.println("Enter new Media detail:  ");
				System.out.println("Title : ");
				sc.nextLine() ;
				String title = sc.nextLine() ;
				System.out.println("Cost : ");
				float cost = sc.nextFloat() ;
				
				System.out.println("Type =  (1: Disc/2: Book/3: CD) ? :  ");
				int type = sc.nextInt() ;
				switch(type) {
					case 1 : 
						DigitalVideoDisc dis = new DigitalVideoDisc(title,"null",cost);
						Aims.Store.addMedia(dis);
						break ;
					case 2 :
						Book book = new Book(title,cost);
						Aims.Store.addMedia(book);
						break ;
					case 3 : 
						CD cd = new CD(title,cost);
						Aims.Store.addMedia(cd);
						break;
				}
			} else {
					System.out.println("Do you want to remove item from store ? (1: Yes, 0: No): ");
					t = sc.nextInt() ;
					
					if (t == 1) {
						System.out.println("Enter name of Media to remove:  ");
						System.out.println("Title : ");
						String title = sc.nextLine() ;
						Media media = Aims.Store.searchByTitle(title) ;
						Aims.Store.removeMedia(media);
				}	
			}
			
		}
}
