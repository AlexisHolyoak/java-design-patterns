package decorator.two;

public class SmallPizza extends Pizza {

    public SmallPizza() {
        this.description = "Small Pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateCost() {
        return 3.00;
    }
}