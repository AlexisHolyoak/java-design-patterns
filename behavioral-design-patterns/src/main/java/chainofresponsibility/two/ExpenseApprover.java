package chainofresponsibility.two;

public interface ExpenseApprover {
    ApprovalResponse approveExpense(ExpenseReport expenseReport);
}