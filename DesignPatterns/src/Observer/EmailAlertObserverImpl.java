package Observer;

import Obsevable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	String email;
	StockObservable observable;
	
	public EmailAlertObserverImpl(String email, StockObservable observable) {
		this.email = email;
		this.observable = observable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail("poduct is in stock hurry up !!",email);
		
	}

	private void sendMail(String message, String email) {
		System.out.println("message sent to :" + email);
		
		
	}
	
	
	
	

}
