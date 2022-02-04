package state.two;

import java.math.BigDecimal;

import state.two.Notification;

public class NoOverdraft extends Overdraft {
    @Override
    public void check(BigDecimal balance, BigDecimal amount, Notification notification) {
        if (balance == null) {
            return;
        }
        if (amount == null) {
            return;
        }
        if (balance.compareTo(amount) < 0) {
            notification.addError("amount cannot be greater than balance");
        }
    }
}
