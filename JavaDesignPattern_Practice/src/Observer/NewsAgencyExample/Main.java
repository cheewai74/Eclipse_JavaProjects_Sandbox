package Observer.NewsAgencyExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewsAgency_Observable observable = new NewsAgency_Observable();
		NewsChannel_Observer observer = new NewsChannel_Observer();
		
		observable.addObserver(observer);
		observable.setNews("Channel News Asia");
		AssertUtils.assertEquals(observer.getNews(), "Channel News Asia");
	}

}
