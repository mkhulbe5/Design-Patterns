package Observer;

import Obsevable.IphoneStockObservableImpl;
import Obsevable.StockObservable;

public class Customer {

	public static void main(String[] args) {
		StockObservable observer = new IphoneStockObservableImpl();
		NotificationAlertObserver client = new EmailAlertObserverImpl("mohit.chand1298@gmail.com", observer);
		observer.add(client);
		observer.setNewStockCount(10);
	}

}
