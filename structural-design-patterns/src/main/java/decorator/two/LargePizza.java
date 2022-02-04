package decorator.two;

public class LargePizza extends Pizza {

    public LargePizza() {
        this.description = "Large Pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateCost() {
        return 9.00;
    }
}