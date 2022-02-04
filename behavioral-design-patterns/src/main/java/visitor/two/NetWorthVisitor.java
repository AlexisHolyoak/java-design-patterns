package visitor.two;

public class NetWorthVisitor implements Visitor {
    private int total;

    @Override
    public void visit(RealEstate realEstate) {
        total += realEstate.getEstimatedValue();
    }

    @Override
    public void visit(BankAccount bankAccount) {
        total += bankAccount.getAmount();
    }

    @Override
    public void visit(Loan loan) {
        total -= loan.getOwed();
    }

    public int getTotal() {
        return total;
    }
}
