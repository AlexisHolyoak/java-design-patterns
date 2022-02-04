package observer.two;

public class StockTicker extends Subject {

    private Stock stock;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
        this.notifyObservers();
    }
}
