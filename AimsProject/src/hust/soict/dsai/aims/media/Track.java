package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title ;
	private int lenght ;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public Track(String title , int lenght) {
		this.title = title ;
		this.lenght = lenght ;
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLenght());
		
	}
	
	
}
