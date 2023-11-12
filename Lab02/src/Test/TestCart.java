package Test;

public class TestCart {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
						"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );		

		anOrder.addDigitalVideoDisc(dvd1, dvd2 , dvd3);
		
// Test Print method		
		anOrder.print();
		
// Test Search Method 
		
		// Search by id
		int idSearch = 4 ;
		System.out.printf("Search by Id = %d\n", + idSearch);
		DigitalVideoDisc dvdSearchId = anOrder.searchById(idSearch);
		if(dvdSearchId != null) System.out.printf("%s\n", dvdSearchId.toString());
		else System.out.println("Can't found this DVD\n");
		
		// Search by Title
		String titleSearch = "Star Wars";
		System.out.printf("Search by Title = %s\n", titleSearch);
		DigitalVideoDisc dvdSearchTitle = anOrder.searchByTitle(titleSearch);
		if(dvdSearchTitle != null) System.out.printf("%s", dvdSearchTitle.toString());
		else System.out.println("Can't found this DVD\n");
	}
		
}
