/**
 * 
 */
package Observer.NewsAgencyExample;

import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency is an observable, and when news gets updated, 
 * the state of NewsAgency changes. When the change happens, 
 * NewsAgency notifies the observers about it by 
 * calling their update() method.
 */
public class NewsAgency_Observable {
	
	private String news;
	private List<Channel> channels = new ArrayList<>();
	
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObsrver(Channel channel) {
		this.channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for(Channel channel: this.channels) {
			channel.update(this.news);
		}
	}
	
	

}
