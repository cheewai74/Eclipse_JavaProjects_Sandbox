/**
 * 
 */
package Observer.NewsAgencyPropertyChangeListenerApproach;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 */
public class ONewsChannel implements Observer {
	
	private String news;

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.setNews((String)news);
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	};

	
	
}
