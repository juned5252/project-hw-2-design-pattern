package behavioral.observer.desin.pattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private subject stockGrabber;
    public StockObserver(subject stockGrabber){
        this.stockGrabber =stockGrabber;
        this.observerID = ++observerID;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.subscribe(this);

    }
    @Override
    public void update(double ibmPrice, double aaplePrice, double googPrice) {
     this.aaplePrice=aaplePrice;
        this.googPrice=googPrice;
        this.ibmPrice=ibmPrice;
        System.out.println(observerID + "\nIBM: "+ ibmPrice + "\nAAPL: " + aaplePrice + "\nGOOG: " + "\n");
    }
}
