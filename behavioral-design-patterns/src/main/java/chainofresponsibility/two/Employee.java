package chainofresponsibility.two;

public class Employee implements ExpenseApprover {

    private String name;
    private double approvalLimit;

    public Employee(String name, double approvalLimit) {
        this.name = name;
        this.approvalLimit = approvalLimit;
    }

    public String getName() {
        return name;
    }

    @Override
    public ApprovalResponse approveExpense(ExpenseReport expenseReport) {
        return expenseReport.getTotal() > approvalLimit ? ApprovalResponse.BeyondApprovalLimit
                : ApprovalResponse.Approved;
    }
}