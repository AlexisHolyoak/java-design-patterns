package state.two;

import java.math.BigDecimal;

public class BankAccount extends Entity {
    private String number;
    private Money balance;
    private BankAccountState state;
    private Overdraft overdraft;
    private Customer customer;

    public BankAccount() {
        state = new ActiveBankAccount(this);
        overdraft = new NoOverdraft();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public BankAccountState getState() {
        return state;
    }

    public void setState(BankAccountState state) {
        this.state = state;
    }

    public Overdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft overdraft) {
        this.overdraft = overdraft;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void depositMoney(BigDecimal amount) {
        this.state.depositMoney(amount, () -> {
            BigDecimal newAmount = this.balance.getAmount().add(amount);
            this.balance.setAmount(newAmount);
        });
    }

    public void withdrawMoney(BigDecimal amount) {
        this.state.withdrawMoney(amount, () -> {
            BigDecimal newAmount = this.balance.getAmount().subtract(amount);
            this.balance.setAmount(newAmount);
        });
    }
}
