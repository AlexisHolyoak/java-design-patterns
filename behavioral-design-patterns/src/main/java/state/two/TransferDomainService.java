package state.two;

import java.math.BigDecimal;

public class TransferDomainService {
    public void performTransfer(BankAccount originAccount, BankAccount destinationAccount, BigDecimal amount)
            throws Exception {
        this.validateTransfer(originAccount, destinationAccount);
        originAccount.withdrawMoney(amount);
        destinationAccount.depositMoney(amount);
    }

    private void validateTransfer(BankAccount originAccount, BankAccount destinationAccount) {
        Notification notification = new Notification();
        this.validateBankAccounts(originAccount, destinationAccount, notification);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
    }

    private void validateBankAccounts(BankAccount originAccount, BankAccount destinationAccount,
            Notification notification) {
        if (originAccount == null) {
            notification.addError("originAccount cannot be null");
        }
        if (destinationAccount == null) {
            notification.addError("destinationAccount cannot be null");
        }
        if (originAccount == null || destinationAccount == null) {
            return;
        }
        if (originAccount.getNumber().equals(destinationAccount.getNumber())) {
            notification.addError("originAccount cannot be equals to destinationAccount");
        }
    }
}
