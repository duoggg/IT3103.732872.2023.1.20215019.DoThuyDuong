package hust.soict.dsai.aims.menu.store;

import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.*;

import hust.soict.dsai.aims.menu.store.media_detail.MediaMenu;
import hust.soict.dsai.aims.store.Store;

public class StoreMenu {
	private static Scanner sc = new Scanner(System.in);
	public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
	
////OPTION
	public boolean selectOption() {
		
		int opt = sc.nextInt() ;
		
		switch(opt) {
			case 0 : return false ;
			case 1 :
						Aims.Store.printStore();
						Media media1 = enterTitleAndSearch();
						
						if(media1!=null) {
							System.out.println(media1.toString());
							
							/// Show mediaDetailMenu
							boolean k = true ;
							while(k) {
								MediaMenu.mediaDetailsMenu();
								MediaMenu m = new MediaMenu(media1) ;
								k = m.selectOption();
								System.out.println("");
							}
						} else {
							System.out.println("Not exist that media ");
						}
						
						break ;
				
			case 2 :
					    Aims.Store.printStore();
						Media media2 = enterTitleAndSearch();
						
						if(media2 !=null) {
							System.out.println(media2.toString());
							Aims.Order.addMedia(media2); 
						} else {
							System.out.println("Not exist that media ");
						}
						break ;
				
			case 3 :
						Aims.Store.printStore();
						Media media3 = enterTitleAndSearch();
						
						if(media3 instanceof DigitalVideoDisc) {
							((DigitalVideoDisc) media3).play();
						} else {
							System.out.println("Can't play");
						}
						break ;
			
			case 4 : 
						Aims.Order.print();
						break ;
				
			default : 
						System.out.println("Wrong Option!");
						break ;
		}
		
		return true ;
}
		
		public Media enterTitleAndSearch() {
			System.out.println("Enter title : ");
			sc.nextLine() ;
			String title = sc.nextLine() ;
			
			Media media = Aims.Store.searchByTitle(title) ;
			return media ;
		}
}
