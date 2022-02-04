package visitor.two;

public class IncomeVisitor implements Visitor {
    private double amount;

    @Override
    public void visit(RealEstate realEstate) {
        amount += realEstate.getMonthlyRent();
    }

    @Override
    public void visit(BankAccount bankAccount) {
        amount += bankAccount.getAmount() * bankAccount.getMonthlyInterest();
    }

    @Override
    public void visit(Loan loan) {
        amount -= loan.getMonthlyPayment();
    }

    public double getAmount() {
        return amount;
    }
}
