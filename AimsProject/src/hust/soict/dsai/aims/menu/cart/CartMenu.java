package hust.soict.dsai.aims.menu.cart;

import java.util.Scanner;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.menu.store.StoreMenu;

public class CartMenu {
	private static Scanner sc = new Scanner(System.in);
	public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
	
	public boolean selectOption() {
		int opt = sc.nextInt() ;
		switch(opt) {
			case 0 : 	return false ;
			case 1 :
						filterInCart();
						break ;
			case 2 :
						sortCart() ;
						break ;
			case 3 :
						sc.nextLine();
						String title3 = sc.nextLine();
						if(title3 != null) Aims.Order.removeMedia(Aims.Order.searchByTitle(title3));
						else System.out.println("Not exists!");
						break ;
			case 4 :
						String title4 = sc.nextLine();
						Media media = Aims.Order.searchByTitle(title4) ;
						if(media instanceof DigitalVideoDisc) ((DigitalVideoDisc) media).play();
						else System.out.println("Can't play");
						break ;
			case 5 :
						if(Aims.Order.numberOfItems()==0){
							System.out.println("!!!! Your order is EMPTY !!!!");
						}
						else{
							Aims.Order.clear();
							System.out.println("**** Order is created ****");
						}
				break ;
			default : 
						System.out.println("Wrong Option!");
						break ;
		}
		return true ;
	}
	
	public void filterInCart() {
		System.out.println("Do you want to filter by ID or Title ? (1: ID, 2: Title): ");
		int t = sc.nextInt() ;
		if (t == 1) {
			System.out.println("ID : ");
			int id = sc.nextInt() ;
			Media media = Aims.Order.searchById(id);
			if(media != null) System.out.println(media.toString());
			else System.out.println("Not existed !");
	}
		else if(t== 2) {
			System.out.println("Title : ");
			sc.nextLine();
			String title = sc.nextLine() ;
			Media media = Aims.Order.searchByTitle(title);
			if(media != null) System.out.println(media.toString());
			else System.out.println("Not existed !");
		}
}
	public void sortCart() {
		System.out.println("Do you want to filter by Title or Cost ? (1: Title, 2: Cost) : ");
		int t = sc.nextInt() ;
		if (t == 1) {
			Aims.Order.sortByCost();
	}
		else if(t== 2) {
			Aims.Order.sortByTitle();
		}
}
}
