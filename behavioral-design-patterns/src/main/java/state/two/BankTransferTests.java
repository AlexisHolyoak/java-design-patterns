package state.two;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BankTransferTests {

    private String originBankAccountNumber = "123-456-001";
    private String destinationBankAccountNumber = "123-456-002";

    @Test
    public void performTransferActiveAccountsSuccess() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
        assertThat(originBankAccount.getBalance().getAmount(), is(new BigDecimal(50)));
        assertThat(destinationBankAccount.getBalance().getAmount(), is(new BigDecimal(150)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferNoFundsError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 10, "USD");
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferSameAccountsError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        BankAccount destinationBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferNullAccountsError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = null;
        BankAccount destinationBankAccount = null;
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferNullAmountError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        BigDecimal amount = null;
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferLockedOriginAccountError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        originBankAccount.getState().lock();
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void performTransferLockedDestinationAccountError() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 100, "USD");
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        destinationBankAccount.getState().lock();
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
    }

    @Test
    public void performTransferNoFundsWithLimitedOverdraft() throws Exception {
        TransferDomainService transferDomainService = new TransferDomainService();
        BankAccount originBankAccount = buildBankAccount(originBankAccountNumber, 10, "USD");
        BigDecimal limitOverdraft = new BigDecimal(1500);
        originBankAccount.setOverdraft(new LimitedOverdraft(limitOverdraft));
        BankAccount destinationBankAccount = buildBankAccount(destinationBankAccountNumber, 100, "USD");
        BigDecimal amount = new BigDecimal(50);
        transferDomainService.performTransfer(originBankAccount, destinationBankAccount, amount);
        assertThat(originBankAccount.getBalance().getAmount(), is(new BigDecimal(-40)));
        assertThat(destinationBankAccount.getBalance().getAmount(), is(new BigDecimal(150)));
    }

    private BankAccount buildBankAccount(String number, double amount, String currency) {
        Money balance = buildMoney(amount, currency);
        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumber(number);
        bankAccount.setBalance(balance);
        return bankAccount;
    }

    private Money buildMoney(double amount, String currency) {
        BigDecimal moneyAmount = new BigDecimal(amount);
        return new Money(moneyAmount, currency);
    }
}
