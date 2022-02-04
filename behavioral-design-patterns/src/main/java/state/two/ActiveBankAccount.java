package state.two;

import java.math.BigDecimal;

public class ActiveBankAccount extends BankAccountState {

    public ActiveBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected void depositMoney(BigDecimal amount, Runnable addToBalance) {
        this.validateDeposit(amount);
        addToBalance.run();
        this.transitionState();
    }

    @Override
    protected void validateDeposit(BigDecimal amount) {
        super.validateGenericDeposit(amount);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
    }

    @Override
    protected void withdrawMoney(BigDecimal amount, Runnable subtractFromBalance) {
        this.validateWithdraw(amount);
        subtractFromBalance.run();
        this.transitionState();
    }

    @Override
    protected void validateWithdraw(BigDecimal amount) {
        super.validateGenericWithdraw(amount);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
    }

    @Override
    public void lock() {
        this.bankAccount.setState(new LockedBankAccount(this.bankAccount));
    }

    @Override
    public void unlock() {
    }

    @Override
    public void freeze() {
        this.bankAccount.setState(new FrozenBankAccount(this.bankAccount));
    }

    @Override
    public void close() {
        this.bankAccount.setState(new ClosedBankAccount(this.bankAccount));
    }

    @Override
    protected BankAccountState transitionState() {
        if (this.bankAccount.getBalance().getAmount().signum() < 0) {
            this.bankAccount.setState(new OverdrawnBankAccount(this.bankAccount));
        }
        return this.bankAccount.getState();
    }
}
