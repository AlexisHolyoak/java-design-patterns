package observer.two;

import java.math.BigDecimal;

public class GoogleObserver extends Observer {

    public GoogleObserver(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    void update() {
        BigDecimal price = subject.getStock().getPrice();
        String symbol = subject.getStock().getSymbol();

        // Reactive Filters
        if (symbol.equals("GOOG")) {
            System.out.println("Google's new price is: " + price);
        }
    }
}
