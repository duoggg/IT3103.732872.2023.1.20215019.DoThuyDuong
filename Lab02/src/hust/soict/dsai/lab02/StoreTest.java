package hust.soict.dsai.lab02;

public class StoreTest {
	public static void main(String[] args) {
		System.out.println("Do Thuy Duong 20215019");
		
// Test addDVD	
		System.out.println("\nADD DVD TO STORE");
		Store store = new Store();
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
						"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		
		
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		
		System.out.println("The numbers of dvds in cart: " + store.getQtyOrdered());
		store.printStore();
		
// TEST removeDVD
		System.out.println("\nREMOVE DVD FROM STORE");
		store.removeDVD(dvd2);
		System.out.println("The numbers of dvds in cart: " + store.getQtyOrdered());
		store.printStore();
	}
}
