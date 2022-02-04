package decorator.two;

public class Peppers extends PizzaDecorator {

    public Peppers(Pizza pizza) {
        super(pizza);
        this.description = "Peppers";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", pizza.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.pizza.calculateCost() + 2.00;
    }
}