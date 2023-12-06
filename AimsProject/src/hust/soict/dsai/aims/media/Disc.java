package hust.soict.dsai.aims.media;

public abstract class Disc extends Media  {
	private int lenght ;
	private String director ;
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Disc() {
		super() ;
	}
	
	
}
