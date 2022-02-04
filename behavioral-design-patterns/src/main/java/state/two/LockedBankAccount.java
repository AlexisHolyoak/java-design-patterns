package state.two;

import java.math.BigDecimal;

public class LockedBankAccount extends BankAccountState {

    public LockedBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected void depositMoney(BigDecimal amount, Runnable addToBalance) {
        this.validateDeposit(amount);
    }

    @Override
    protected void validateDeposit(BigDecimal amount) {
        throw new IllegalArgumentException("BankAccount is locked");
    }

    @Override
    protected void withdrawMoney(BigDecimal amount, Runnable subtractFromBalance) {
        this.validateWithdraw(amount);
    }

    @Override
    protected void validateWithdraw(BigDecimal amount) {
        throw new IllegalArgumentException("BankAccount is locked");
    }

    @Override
    public void lock() {
    }

    @Override
    public void unlock() {
        this.bankAccount.setState(new ActiveBankAccount(this.bankAccount));
    }

    @Override
    public void freeze() {
    }

    @Override
    public void close() {
        this.bankAccount.setState(new ClosedBankAccount(this.bankAccount));
    }

    @Override
    protected BankAccountState transitionState() {
        return this.bankAccount.getState();
    }
}
