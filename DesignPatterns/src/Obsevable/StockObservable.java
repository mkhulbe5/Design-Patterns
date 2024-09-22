package Obsevable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
	public void add(NotificationAlertObserver obj);
	public void remove(NotificationAlertObserver obj);
	public void notifySubscriber();
	public void setNewStockCount(int newStock);
	public int getNewStockCount();

}
