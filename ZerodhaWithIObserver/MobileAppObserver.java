public class MobileAppObserver implements IObserver {
    @Override
    public void update(double newPrice) {
        System.out.println("Mobile App: Stock price updated to " + newPrice);
    }
}
