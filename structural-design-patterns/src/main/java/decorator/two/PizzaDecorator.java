package decorator.two;

public class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.description;
    }

    @Override
    public double calculateCost() {
        return pizza.calculateCost();
    }
}