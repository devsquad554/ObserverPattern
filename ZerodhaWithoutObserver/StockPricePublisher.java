public class StockPricePublisher {
    private double price;

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Stock price updated to: " + newPrice);
        updateObservers(newPrice);
    }

    // Tightly coupled observers
    public void updateObservers(double newPrice) {
        MobileAppObserver mobileApp = new MobileAppObserver();
        WebAppObserver webApp = new WebAppObserver();

        mobileApp.updatePrice(newPrice);
        webApp.updatePrice(newPrice);
    }
}
