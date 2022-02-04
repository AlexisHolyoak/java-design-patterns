package state.two;

import java.math.BigDecimal;

import state.two.Notification;

public abstract class BankAccountState extends Entity {
    protected BankAccount bankAccount;
    protected Notification notification;

    public BankAccountState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        notification = new Notification();
    }

    protected abstract void depositMoney(BigDecimal amount, Runnable addToBalance);

    protected abstract void validateDeposit(BigDecimal amount);

    protected abstract void withdrawMoney(BigDecimal amount, Runnable subtractFromBalance);

    protected abstract void validateWithdraw(BigDecimal amount);

    public abstract void lock();

    public abstract void unlock();

    public abstract void freeze();

    public abstract void close();

    protected abstract BankAccountState transitionState();

    protected BankAccount getBankAccount() {
        return bankAccount;
    }

    protected void setBankAccount(BankAccount newAccount) {
        this.bankAccount = newAccount;
    }

    protected void validateGenericDeposit(BigDecimal amount) {
        this.validateAmount(amount);
    }

    protected void validateGenericWithdraw(BigDecimal amount) {
        this.validateAmount(amount);
        this.validateBalance(amount);
    }

    protected void validateAmount(BigDecimal amount) {
        if (amount == null) {
            notification.addError("amount cannot be null");
            return;
        }
        if (amount.signum() <= 0) {
            notification.addError("amount must be positive");
        }
    }

    protected void validateBalance(BigDecimal amount) {
        if (amount == null) {
            return;
        }
        if (this.bankAccount.getBalance() == null) {
            notification.addError("balance cannot be null");
            return;
        }
        if (this.bankAccount.getBalance().getAmount() == null) {
            notification.addError("amount cannot be null");
            return;
        }
        this.bankAccount.getOverdraft().check(this.bankAccount.getBalance().getAmount(), amount, notification);
    }
}
