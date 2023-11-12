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
	
	// // Overloading with array
	// public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	// 	for(DigitalVideoDisc i : dvdList){
	// 		addDigitalVideoDisc(i);
	// 	}
	// 	System.out.println("The disc has been added ");
	// }

	// Overloading with n arbitrary number of arguments
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
		for(DigitalVideoDisc i : dvdList){
			addDigitalVideoDisc(i);
		}
		//System.out.println("The disc has been added ");
	}

	// Overloading by differering the number of parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
		//System.out.println("The disc has been added ");
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

	// In ra các sản phẩm trong cart 
	public void printCart(){
		for(int i = 0 ; i < this.qtyOrdered ; i++){
			System.out.println("ID : " + this.itemsOrdered[i].getID() + 
							   " Title : " + this.itemsOrdered[i].getTitle() + 
							   " Cost : " + this.itemsOrdered[i].getCost() );
		}
		
	}

	// In ra các sản phẩm có trong cart 
	public void print() {
		System.out.println("Do Thuy Duong 20215019");
		System.out.println("***********************CART***********************");
        
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.printf("%s\n",dvd.toString());
        }

        float totalCost = totalCost();
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }
	
}
