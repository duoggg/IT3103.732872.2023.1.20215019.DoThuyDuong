package hust.soict.dsai.lab02;

public class Aim {
	public static void main(String[] args) {
		// Cart anOrder = new Cart();
		// System.out.println("Do Thuy Duong 20215019\n" );
		// DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
		// 				"Roger Allers", 87, 19.95f );
		// DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
		// 		"George Lucas", 87, 24.95f );
		// DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );
		
		// anOrder.addDigitalVideoDisc(dvd1);
		// anOrder.addDigitalVideoDisc(dvd2);
		// anOrder.addDigitalVideoDisc(dvd3);
		

		
		// System.out.println("Total Cost is: " + anOrder.totalCost());
		// //System.out.println("Total Cost is: " + anOrder.getQtyOrdered());
		
		// anOrder.removeDigitalVideoDisc(dvd1);
		// System.out.println("Total Cost is: " + anOrder.totalCost());

// Ket qua chay thu OVERLOADING with arbitrary number of arguments

		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
						"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		

		anOrder.addDigitalVideoDisc(dvd1, dvd2 , dvd3);
		System.out.println("The numbers of dvds in cart: " + anOrder.getQtyOrdered());
		System.out.println("Total cost " + anOrder.totalCost());
		
// // Ket qua chay thu OVERLOADING with array

// 		Cart anOrder = new Cart();
// 		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
// 						"Roger Allers", 87, 19.95f );
// 		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
// 				"George Lucas", 87, 24.95f );
// 		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		
// 		DigitalVideoDisc [] listdvd = {dvd1, dvd2,dvd3};

// 		anOrder.addDigitalVideoDisc(listdvd);
// 		System.out.println("Do Thuy Duong 20215019");
// 		System.out.println("The numbers of dvds in cart: " + anOrder.getQtyOrdered());
// 		System.out.println("Total cost " + anOrder.totalCost());
	}
	
}
