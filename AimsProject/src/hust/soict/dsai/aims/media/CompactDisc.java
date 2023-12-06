package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist ;
	private ArrayList<Track> track = new ArrayList<>();
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public CompactDisc() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Artist : " + this.getArtist());
		System.out.println("Numbers of Track: " + this.track.size());
		System.out.println("Track details: ");
		for(Track t : track) {
			t.play();
		}
		
	}
	
	public void addTrack(Track t) {
		if(!track.contains(t)) {
			track.add(t);
		} else {
			System.out.println("Track Existed !!!");
		}
	}
	
	public void removeAuthor(Track t) {
		if(track.contains(t)) {
			track.remove(t) ;
		} else {
			System.out.println("Track Not Exists !!!");
		}
	}
	
	public int getLenght() {
		int lenght = 0;
		for(Track t : track) 
			lenght += t.getLenght() ;
		return lenght ;
	}
	
	
	
}
