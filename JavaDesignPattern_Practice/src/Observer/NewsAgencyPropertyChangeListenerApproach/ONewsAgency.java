package Observer.NewsAgencyPropertyChangeListenerApproach;

//1. we don’t need to call the observer’s update() method directly. 
//   We just call setChanged() and notifyObservers(), and the Observable class 
//   will do the rest for us.
//
//2. It also contains a list of observers and exposes methods to maintain that list, 
//   addObserver() and deleteObserver().

import java.util.Observable;

public class ONewsAgency extends Observable{
	
	private String news;

	public void setNews(String news) {
		this.news = news;
		setChanged();
		notifyObservers(news);
	}
	
	

}
