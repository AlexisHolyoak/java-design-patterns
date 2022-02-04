package chainofresponsibility.two;

public class EndOfChainExpenseHandler implements ExpenseHandler {

    private static EndOfChainExpenseHandler instance = null;

    private EndOfChainExpenseHandler() {
    }

    public static EndOfChainExpenseHandler getInstance() {
        if (instance == null) {
            synchronized (EndOfChainExpenseHandler.class) {
                if (instance == null) {
                    instance = new EndOfChainExpenseHandler();
                }
            }
        }
        return instance;
    }

    @Override
    public ApprovalResponse approve(ExpenseReport expenseReport) {
        return ApprovalResponse.Denied;
    }

    @Override
    public void registerNext(ExpenseHandler next) {
        throw new UnsupportedOperationException("End of chain handler must be the end of the chain!");
    }
}
