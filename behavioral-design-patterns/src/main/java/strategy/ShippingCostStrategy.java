package strategy;

public interface ShippingCostStrategy {
    double calculate(Order order);
}