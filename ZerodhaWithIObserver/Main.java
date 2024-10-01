public class Main {
    public static void main(String[] args) {
        StockPricePublisher publisher = new StockPricePublisher();

        MobileAppObserver mobileObserver = new MobileAppObserver();
        WebAppObserver webObserver = new WebAppObserver();

        publisher.addObserver(mobileObserver);
        publisher.addObserver(webObserver);

        publisher.setPrice(150.75);

        publisher.removeObserver(webObserver);
        publisher.setPrice(152.30);
    }
}
