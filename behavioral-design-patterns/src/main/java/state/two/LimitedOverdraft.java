package state.two;

import java.math.BigDecimal;

import state.two.Notification;

public class LimitedOverdraft extends Overdraft {
    private BigDecimal limit;

    public LimitedOverdraft(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public void check(BigDecimal balance, BigDecimal amount, Notification notification) {
        if (balance == null) {
            return;
        }
        if (amount == null) {
            return;
        }
        if (balance.compareTo(amount) >= 0) {
            return;
        }
        BigDecimal newBalance = balance.subtract(amount);
        if (newBalance.abs().compareTo(limit) > 0) {
            notification.addError("overdraft limit exceeded");
        }
    }
}
