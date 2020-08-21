package behavioral.observer.desin.pattern;

import java.util.ArrayList;

public class StockGrabber implements subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer addObserver) {

    }

    @Override
    public void unsubscribe(Observer deleteObserver) {
          int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + "deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(ibmPrice,aaplePrice,googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAaplePrice(double aaplePrice) {
        this.aaplePrice = aaplePrice;
        notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }
}
