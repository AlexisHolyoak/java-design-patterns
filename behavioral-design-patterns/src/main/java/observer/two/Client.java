package observer.two;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        Subject subject = new StockTicker();

        GoogleObserver googleObserver = new GoogleObserver(subject);
        MicrosoftObserver microsoftObserver = new MicrosoftObserver(subject);

        for (Stock stock : getStocks()) {
            subject.setStock(stock);
            System.out.println("------------------------------------------------");
        }
    }

    public static List<Stock> getStocks() {
        List<Stock> stocks = new ArrayList<>();

        Stock stock1 = new Stock();
        stock1.setPrice(new BigDecimal(120));
        stock1.setSymbol("MSFT");
        stocks.add(stock1);

        Stock stock2 = new Stock();
        stock2.setPrice(new BigDecimal(555));
        stock2.setSymbol("GOOG");
        stocks.add(stock2);

        Stock stock3 = new Stock();
        stock3.setPrice(new BigDecimal(10));
        stock3.setSymbol("MSFT");
        stocks.add(stock3);

        return stocks;
    }
}
