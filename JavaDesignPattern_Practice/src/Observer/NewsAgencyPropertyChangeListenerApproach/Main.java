package Observer.NewsAgencyPropertyChangeListenerApproach;

import Observer.NewsAgencyExample.AssertUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ONewsAgency observable = new ONewsAgency();
		ONewsChannel observer = new ONewsChannel();
		
		observable.addObserver(observer);
		observable.setNews("Media Corp News.");
		AssertUtils.assertEquals(observer.getNews(), "Media Corp News.");
	}

}
