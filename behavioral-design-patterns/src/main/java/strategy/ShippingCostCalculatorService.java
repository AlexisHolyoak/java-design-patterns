package strategy;

public class ShippingCostCalculatorService {

    ShippingCostStrategy shippingCostStrategy;

    public ShippingCostCalculatorService(ShippingCostStrategy shippingCostStrategy) {
        this.shippingCostStrategy = shippingCostStrategy;
    }

    public double calculateShippingCost(Order order) {
        return shippingCostStrategy.calculate(order);
    }
}
