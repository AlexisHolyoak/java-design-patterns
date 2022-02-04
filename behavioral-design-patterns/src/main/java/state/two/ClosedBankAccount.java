package state.two;

import java.math.BigDecimal;

public class ClosedBankAccount extends BankAccountState {

    public ClosedBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected void depositMoney(BigDecimal amount, Runnable addToBalance) {
        this.validateDeposit(amount);
    }

    @Override
    protected void validateDeposit(BigDecimal amount) {
        throw new IllegalArgumentException("BankAccount is closed");
    }

    @Override
    protected void withdrawMoney(BigDecimal amount, Runnable subtractFromBalance) {
        this.validateWithdraw(amount);
    }

    @Override
    protected void validateWithdraw(BigDecimal amount) {
        throw new IllegalArgumentException("BankAccount is closed");
    }

    @Override
    public void lock() {
        throw new IllegalArgumentException("BankAccount is closed");
    }

    @Override
    public void unlock() {
        throw new IllegalArgumentException("BankAccount is closed");
    }

    @Override
    public void freeze() {
        throw new IllegalArgumentException("BankAccount is closed");
    }

    @Override
    public void close() {
    }

    @Override
    protected BankAccountState transitionState() {
        return this.bankAccount.getState();
    }
}
