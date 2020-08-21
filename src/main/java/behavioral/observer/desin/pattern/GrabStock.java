package behavioral.observer.desin.pattern;

public class GrabStock {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setAaplePrice(200.00);
        stockGrabber.setGoogPrice(2780.00);
        stockGrabber.setIbmPrice(290.00);
    }
}
