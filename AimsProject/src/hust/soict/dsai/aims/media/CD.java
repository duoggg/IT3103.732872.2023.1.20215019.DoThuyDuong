package hust.soict.dsai.aims.media;

import java.util.List;

public class CD extends Media{
	
	private String artist ;
	private String director;
	private List<Track> trackList ;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public CD() {
		super() ;
	}
	
	public CD(String title, float cost) {
		super(title,cost);
		
	}
	
	public String toString() {
		return ( " CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + " - " + this.getCost() + "$"  ) ;
	}
	
}
