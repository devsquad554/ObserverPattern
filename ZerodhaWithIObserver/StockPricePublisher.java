import java.util.ArrayList;
import java.util.List;

public class StockPricePublisher {
    private double price;
    private List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Stock price updated to: " + newPrice);
        notifyObservers(newPrice);
    }

    private void notifyObservers(double newPrice) {
        for (IObserver observer : observers) {
            observer.update(newPrice);
        }
    }
}
