package decorator.two;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
        this.description = "Cheese";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", pizza.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.pizza.calculateCost() + 1.25;
    }
}