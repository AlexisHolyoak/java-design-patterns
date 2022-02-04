package strategy;

public class USPSShippingCostStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(Order order) {
        return 3.00;
    }
}
