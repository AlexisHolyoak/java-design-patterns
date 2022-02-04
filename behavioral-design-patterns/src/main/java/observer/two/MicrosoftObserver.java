package observer.two;

import java.math.BigDecimal;

public class MicrosoftObserver extends Observer {

    public MicrosoftObserver(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    void update() {
        BigDecimal price = subject.getStock().getPrice();
        String symbol = subject.getStock().getSymbol();

        // Reactive Filters
        if (symbol.equals("MSFT") && price.doubleValue() > 10.00) {
            System.out.println("Microsoft has reached the target price: " + price);
        }
    }
}
