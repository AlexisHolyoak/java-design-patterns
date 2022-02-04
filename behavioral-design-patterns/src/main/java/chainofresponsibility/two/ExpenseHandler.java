package chainofresponsibility.two;

public interface ExpenseHandler {
    ApprovalResponse approve(ExpenseReport expenseReport);

    void registerNext(ExpenseHandler next);
}