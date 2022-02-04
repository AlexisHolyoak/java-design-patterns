package visitor.two;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.getAssets().add(new BankAccount(1000, 0.01));
        person.getAssets().add(new BankAccount(2000, 0.02));
        person.getAssets().add(new RealEstate(79000, 500));
        person.getAssets().add(new Loan(40000, 40));

        NetWorthVisitor netWorthVisitor = new NetWorthVisitor();
        IncomeVisitor incomeVisitor = new IncomeVisitor();

        person.accept(netWorthVisitor);
        person.accept(incomeVisitor);

        System.out.println(netWorthVisitor.getTotal());
        System.out.println(incomeVisitor.getAmount());
    }
}
