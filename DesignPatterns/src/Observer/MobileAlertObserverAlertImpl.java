package Observer;

import Obsevable.StockObservable;

public class MobileAlertObserverAlertImpl implements NotificationAlertObserver{

	public StockObservable stockObservable;
	public String userName;
	
	public MobileAlertObserverAlertImpl(String userName,StockObservable stockObservable) {
		this.stockObservable = stockObservable;
		this.userName = userName;
	}

	@Override
	public void update(){
		sendMail(userName,"product is out of stock");	
	}

	private void sendMail(String userName,String msg) {
	System.out.println(msg + "," + "message has been deliver at : " + userName);
		
	}
	
	
}
