package visitor.two;

public class Loan implements Asset {
    private int owed;
    private int monthlyPayment;

    public Loan(int owed, int monthlyPayment) {
        this.owed = owed;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getOwed() {
        return owed;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }
}
