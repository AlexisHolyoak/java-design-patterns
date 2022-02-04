package visitor.two;

public interface Visitor {
    void visit(RealEstate realEstate);

    void visit(BankAccount bankAccount);

    void visit(Loan loan);
}
