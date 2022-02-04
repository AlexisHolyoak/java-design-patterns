package chainofresponsibility.two;

public class ExpenseReportImpl implements ExpenseReport {

    private double total;

    public ExpenseReportImpl(double total) {
        this.total = total;
    }

    @Override
    public double getTotal() {
        return total;
    }
}