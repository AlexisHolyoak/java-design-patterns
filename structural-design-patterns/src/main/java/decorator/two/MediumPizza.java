package decorator.two;

public class MediumPizza extends Pizza {

    public MediumPizza() {
        this.description = "Medium Pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateCost() {
        return 6.00;
    }
}