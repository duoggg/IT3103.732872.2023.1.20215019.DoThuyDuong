package Test;

// Do Thuy Duong 20215019

public class DigitalVideoDisc {
	

	private String title;
	private String category;
	private String director;
	private int lenght;
	private float cost;
	private int id ;
	private static int nbDigitalVideoDiscs = 0;

	
	// accessors and mutators
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getID() {
		return id;
	}
	
	// Lấy số lượng đĩa có trong cart
	public int getNbDigitalVideoDisc() {
		return nbDigitalVideoDiscs;
	}
	
	// Chuỗi dữ liệu trong DVD
	public String toString() {
		return (this.id + "." + " DVD - " + this.title + " - " + this.category + " - " + this.director + " - " 
				+ this.lenght + " : " + this.cost + "$" ) ;
	}

	// Do Thuy Duong 20215019
	// constuctor method
	
	public DigitalVideoDisc() {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;

		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;

		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;

		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		// tăng số lượng và set ID
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
		
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	

	
	
	
}
