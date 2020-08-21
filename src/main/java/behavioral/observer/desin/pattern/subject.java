package behavioral.observer.desin.pattern;

public interface subject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
}
