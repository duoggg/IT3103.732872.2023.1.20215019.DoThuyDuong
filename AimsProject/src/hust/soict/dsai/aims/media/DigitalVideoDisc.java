package hust.soict.dsai.aims.media;

// Do Thuy Duong 20215019

public class DigitalVideoDisc extends Disc implements Playable {
	

	private static int nbDigitalVideoDiscs = 0;

	// Lấy số lượng đĩa có trong cart
	public int getNbDigitalVideoDisc() {
		return nbDigitalVideoDiscs;
	}
	
	// Do Thuy Duong 20215019
	// constuctor method
	
	public DigitalVideoDisc() {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
		//id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);

		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLenght(lenght) ;
		this.setCost(cost);
	}
	
	public DigitalVideoDisc(String title) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);

		//this.title = title;
		this.setTitle(title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);

		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
		
		this.setTitle(title);
		this.setCategory(category);
//		this.director = director;
		this.setDirector(director);
		this.setCost(cost);
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLenght());
		
	}
	
	// Chuỗi dữ liệu trong DVD
		public String toString() {
			return (this.getId() + "." + " DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " 
					+ this.getLenght() + " : " + this.getCost() + "$" ) ;
		}

	
	
	
}
