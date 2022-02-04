package chainofresponsibility.two;

public class ExpenseHandlerImpl implements ExpenseHandler {

    private ExpenseApprover approver;
    private ExpenseHandler next;

    public ExpenseHandlerImpl(ExpenseApprover expenseApprover) {
        this.approver = expenseApprover;
        this.next = EndOfChainExpenseHandler.getInstance();
    }

    @Override
    public ApprovalResponse approve(ExpenseReport expenseReport) {
        ApprovalResponse response = this.approver.approveExpense(expenseReport);
        if (response == ApprovalResponse.BeyondApprovalLimit) {
            return this.next.approve(expenseReport);
        }
        return response;
    }

    @Override
    public void registerNext(ExpenseHandler next) {
        this.next = next;
    }
}