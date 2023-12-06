package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20 ;

	private  ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public Cart() {
		
	}
	
	public int numberOfItems() {
		return itemsOrdered.size();
	}
	
	public void clear() {
		itemsOrdered = new ArrayList<Media>();
	}
	
	public void addMedia(Media disc) {
		if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full !");
		else {
			this.itemsOrdered.add(disc);
			System.out.println("The Media has been added ");
		}	
	}
	

	// Overloading with n arbitrary number of arguments
	public void addMedia(Media... dvdList){
		for(Media i : dvdList){
			addMedia(i);
		}
		//System.out.println("The disc has been added ");
	}

	
	public void  removeMedia(Media disc) {
		if(itemsOrdered.size() == 0) System.out.println("Nothing in your cart !");
		else {
			for(Media m : itemsOrdered) {
				if(disc.getTitle().equals(m.getTitle())) {
					
					// Cap nhat lai array itemsOrdered[] 
					itemsOrdered.remove(m);
					
					// Dua ra thong bao
					System.out.println("The Media has been removed !");
					break;
				}
			}
		}	
	}
	
	public float totalCost() {
		float sum  = 0;
		for(Media m : itemsOrdered) {
			sum += m.getCost() ;
		}
		return sum ; 
	}

	// Tìm kiếm theo Id
	public Media searchById(int id){
		for(Media m : itemsOrdered){
			if(m.getId() == id) return m;
		}	
		return null;
	}
	
	// Tìm kiếm theo Title
		public Media searchByTitle(String title){
			for(Media m : itemsOrdered){
				if(m.getTitle().equals(title) ) return m;
			}
			
			return null;
		}
		
	// Sort By Title
		public void sortByTitle() {
	        Collections.sort(itemsOrdered, new Comparator<Media>() {
	            @Override
	            public int compare(Media media1, Media media2) {
	                return media1.getTitle().compareTo(media2.getTitle());
	            }
	        });
	        System.out.println("Cart sorted by title.");
	        printCart();
	    }
	// Sort By Cost
		public void sortByCost() {
	        Collections.sort(itemsOrdered, new Comparator<Media>() {
	            @Override
	            public int compare(Media media1, Media media2) {
	                return Float.compare(media1.getCost(), media2.getCost());
	            }
	        });
	        System.out.println("Cart sorted by cost.");
	        printCart();
	    }
			
	// In ra các sản phẩm trong cart 
	public void printCart(){
		for(Media m : itemsOrdered){
			System.out.println("ID : " + m.getId() + 
							   " Title : " + m.getTitle() + 
							   " Cost : " + m.getCost() );
		}
		
	}

	// In ra các sản phẩm có trong cart 
	public void print() {
		System.out.println("Do Thuy Duong 20215019");
		System.out.println("***********************CART***********************");
        
        for (Media m : itemsOrdered) {
            System.out.printf("%s\n",m.toString());
        }

        float totalCost = totalCost();
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }
	
}
