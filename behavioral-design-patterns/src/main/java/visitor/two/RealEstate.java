package visitor.two;

public class RealEstate implements Asset {
    private int estimatedValue;
    private int monthlyRent;

    public RealEstate(int estimatedValue, int monthlyRent) {
        this.estimatedValue = estimatedValue;
        this.monthlyRent = monthlyRent;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }
}
