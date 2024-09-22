package Obsevable;

import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneStockObservableImpl implements StockObservable{
	
	List<NotificationAlertObserver> notificationAlertObserver;
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver obj) {
		notificationAlertObserver.add(obj);
	}

	@Override
	public void remove(NotificationAlertObserver obj) {
		notificationAlertObserver.remove(obj);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver notifySubs : notificationAlertObserver) {
			notifySubs.update();
		}
		
	}

	@Override
	public void setNewStockCount(int newStock) {
		if(stockCount == 0) {
			notifySubscriber();
		}
		stockCount += newStock; 
		
	}

	@Override
	public int getNewStockCount() {
		return stockCount;
	}

}
