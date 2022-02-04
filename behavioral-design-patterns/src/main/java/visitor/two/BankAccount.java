package visitor.two;

public class BankAccount implements Asset {
    private int amount;
    private double monthlyInterest;

    public BankAccount(int amount, double monthlyInterest) {
        this.amount = amount;
        this.monthlyInterest = monthlyInterest;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAmount() {
        return amount;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }
}
