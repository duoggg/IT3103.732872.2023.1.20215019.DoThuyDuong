package hust.soict.dsai.lab02;

public class Store {
	public static final int MAX_NUMBERS_ORDERED = 20 ;
	private int qtyOrdered  ; 
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public Store() {
		
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	// Them DVD
	public void addDVD(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) System.out.println("The store is almost full !");
		else {
			this.itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++ ;
			System.out.println("The disc has been added to store ");
		}			
	}
	
	// Xoa DVD
	public void  removeDVD(DigitalVideoDisc disc) {
		if(qtyOrdered <= 0) System.out.println("Nothing in store !");
		else {
			for(int i = 0 ; i < qtyOrdered ; i++) {
				if(disc.getTitle().equals(itemsOrdered[i].getTitle())) {
					
					// Cap nhat lai array itemsOrdered[] 
					for(int j = i ; j < qtyOrdered ; j++) {
						itemsOrdered[j] = itemsOrdered[j + 1]; 
					}
					
					// Cap nhat lai so luong DVD trong gio hang
					qtyOrdered-- ;
					
					// Dua ra thong bao
					System.out.println("The disc has been removed from store !");
					break;
				}
			}
		}	
	}
	
	// In ra cac DVD co trong Store
	public void printStore(){
		for(int i = 0 ; i < this.qtyOrdered ; i++){
			System.out.println( 
							   " Title : " + this.itemsOrdered[i].getTitle() + 
							   " Cost : " + this.itemsOrdered[i].getCost() 
							   );
		}
		
	}
}
