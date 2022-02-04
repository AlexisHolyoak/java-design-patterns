package strategy;

public class UPSShippingCostStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(Order order) {
        return 4.25;
    }
}
