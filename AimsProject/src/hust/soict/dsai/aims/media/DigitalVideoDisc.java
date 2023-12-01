package hust.soict.dsai.aims.media;

// Do Thuy Duong 20215019

public class DigitalVideoDisc extends Disc {
	

	private static int nbDigitalVideoDiscs = 0;

	
	// Lấy số lượng đĩa có trong cart
	public int getNbDigitalVideoDisc() {
		return nbDigitalVideoDiscs;
	}
	
	// Chuỗi dữ liệu trong DVD
	public String toString() {
		return (super.getId() + "." + " DVD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " 
				+ super.getLenght() + " : " + super.getCost() + "$" ) ;
	}

	// Do Thuy Duong 20215019
	// constuctor method
	
	public DigitalVideoDisc() {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		super.setId(nbDigitalVideoDiscs);
		//id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		super.setId(nbDigitalVideoDiscs);

		super.setTitle(title);
		super.setCategory(category);
		super.setDirector(director);
		super.setLenght(lenght) ;
		super.setCost(cost);
	}
	
	public DigitalVideoDisc(String title) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		super.setId(nbDigitalVideoDiscs);

		//this.title = title;
		super.setTitle(title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		super.setId(nbDigitalVideoDiscs);

		super.setTitle(title);
		super.setCategory(category);
		super.setCost(cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		super.setId(nbDigitalVideoDiscs);
		
		super.setTitle(title);
		super.setCategory(category);
//		this.director = director;
		super.setDirector(director);
		super.setCost(cost);
	}
	

	
	
	
}
