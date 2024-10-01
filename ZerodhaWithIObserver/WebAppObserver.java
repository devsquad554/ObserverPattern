public class WebAppObserver implements IObserver {
    @Override
    public void update(double newPrice) {
        System.out.println("Web App: Stock price updated to " + newPrice);
    }
}
