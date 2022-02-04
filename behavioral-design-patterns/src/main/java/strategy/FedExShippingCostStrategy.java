package strategy;

public class FedExShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double calculate(Order order) {
        return 5.00;
    }
}
