package state.two;

import java.util.Set;

public class Customer extends Entity {
    private String firstName;
    private String lastName;
    private Set<BankAccount> bankAccounts;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String getFullName() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }
}
