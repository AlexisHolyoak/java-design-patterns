package chainofresponsibility.two;

public class Client {

    public static void main(String[] args) {
        ExpenseHandler william = new ExpenseHandlerImpl(new Employee("William Worker", 0));
        ExpenseHandler mary = new ExpenseHandlerImpl(new Employee("Mary Manager", 1000));
        ExpenseHandler victor = new ExpenseHandlerImpl(new Employee("Victor Vicepres", 5000));
        ExpenseHandler paula = new ExpenseHandlerImpl(new Employee("Paula President", 20000));

        william.registerNext(mary);
        mary.registerNext(victor);
        victor.registerNext(paula);

        // double expenseReportAmount = 20001;
        double expenseReportAmount = 10000;
        ExpenseReport expense = new ExpenseReportImpl(expenseReportAmount);
        ApprovalResponse response = william.approve(expense);
        System.out.format("The request was %s.\n", response);
    }
}
