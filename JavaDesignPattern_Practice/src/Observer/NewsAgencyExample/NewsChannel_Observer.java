/**
 * 
 */
package Observer.NewsAgencyExample;

/**
 * update() method is invoked when the state of 
 * NewsAgency changes.
 */
public class NewsChannel_Observer implements Channel {

	private String news;

	@Override
	public void update(Object news) {
		// TODO Auto-generated method stub
		this.setNews((String) news);
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getNews() {		
		return news;
	}


}
