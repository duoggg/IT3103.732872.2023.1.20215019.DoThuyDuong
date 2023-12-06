package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.media.comparator.MediaComparatorByTitleCost;

public class MediaTest {
	public static void main(String[] args) {
		ArrayList<Media> meda = new ArrayList<Media>() ;
		DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", 
				"Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", 
				"George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f );	
		
		Book book1 = new Book() ;
		book1.setId(1);
		book1.setTitle("book");
		book1.setCategory("Science Fiction");
		book1.setCost(1.82f);
		
		CD cd1 = new CD() ;
		cd1.setId(1);
		cd1.setTitle("cd");
		cd1.setCategory("Animation");
		cd1.setCost(1.81f);
		
		meda.add(dvd1) ;
		meda.add(book1);
		meda.add(cd1);
		
		System.out.println("SORT BY TITLE");
		Collections.sort(meda, Media.COMPARE_BY_TITLE_COST);
		for(Iterator<Media> i = meda.iterator();i.hasNext();) {
			Media media = i.next() ;
			System.out.println(media.toString());
		}
		
		System.out.println("\nSORT BY COST");
		Collections.sort(meda, Media.COMPARE_BY_COST_TITLE);
		for(Iterator<Media> i = meda.iterator();i.hasNext();) {
			Media media = i.next() ;
			System.out.println(media.toString());
		}
		
		
	}
	
}
