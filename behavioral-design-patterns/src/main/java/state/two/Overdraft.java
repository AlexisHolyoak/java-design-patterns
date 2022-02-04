package state.two;

import java.math.BigDecimal;

import state.two.Notification;

public abstract class Overdraft {
    public abstract void check(BigDecimal balance, BigDecimal amount, Notification notification);
}
