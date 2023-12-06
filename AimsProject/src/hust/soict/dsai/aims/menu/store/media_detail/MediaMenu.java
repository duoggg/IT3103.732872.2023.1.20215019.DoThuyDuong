package hust.soict.dsai.aims.menu.store.media_detail;

import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class MediaMenu {
	
	private static Scanner sc = new Scanner(System.in);
	private Media media ;
	public static void mediaDetailsMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
	
	public MediaMenu(Media media) {
		this.media = media ;
	}
	
	//// OPTION
	public boolean selectOption() {
		int opt = sc.nextInt() ;
		
		switch(opt) {
			case 0 :	
				return false ;
				
			case 1 : 
				Aims.Order.addMedia(media); 
				break ;
				
			case 2 :
				if(media instanceof DigitalVideoDisc) {
					((DigitalVideoDisc) media).play();
				} else {
					System.out.println("Can't play");
				}
				break ;
				
			default : 
				System.out.println("Wrong Option!");
				break ;
		}
		
		return true ;
	}
	
 
}
