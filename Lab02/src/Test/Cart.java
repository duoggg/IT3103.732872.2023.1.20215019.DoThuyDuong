package Test;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20 ;
	private int qtyOrdered  ; 
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	
	public Cart() {
		this.qtyOrdered = 0;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full !");
		else {
			this.itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++ ;
			System.out.println("The disc has been added ");
		}	
	}
	
	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <= 0) System.out.println("Nothing in your cart !");
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
					System.out.println("The disc has been removed !");
					break;
				}
			}
		}	
	}
	
	public float totalCost() {
		float sum  = 0;
		for(int i = 0 ; i < qtyOrdered ; i++) {
			sum += itemsOrdered[i].getCost() ;
		}
		return sum ; 
	}


	

	
	
}
