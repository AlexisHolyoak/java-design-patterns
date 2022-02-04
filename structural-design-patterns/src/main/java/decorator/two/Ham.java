package decorator.two;

public class Ham extends PizzaDecorator {

    public Ham(Pizza pizza) {
        super(pizza);
        this.description = "Ham";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", pizza.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.pizza.calculateCost() + 1.00;
    }
}