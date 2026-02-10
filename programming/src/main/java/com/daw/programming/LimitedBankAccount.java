/*
 Use the examples in slides 23 and 24 called BankAccount and LimitedBankAccount.
Modify the class LimitedBankAccount to:
a)
Modify the "deposit" method in LimitedBankAccount so that you can't have a balance higher than 100.000.
b)
Modify the "withdraw" method so that if the account we are trying to withdraw is greater than the balance, it should permit to withdraw only the "balance" amount and it should show a message indicating it.*/
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class LimitedBankAccount extends BankAccount {

    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("You don't have that money, you only withdraw " + getBalance());
            super.withdraw(getBalance());
        } else {
            super.withdraw(amount);
        }
    }

    public void deposit(int amount) {
        if (getBalance() + amount > 100000) {
            System.out.println("FORBIDEN: You can't have more than 100000, you have already: " + getBalance());
        } else {
            super.deposit(amount);
        }
    }

    public static void main(String[] args) {
        LimitedBankAccount limitedAccount = new LimitedBankAccount();
        limitedAccount.deposit(100);
        limitedAccount.withdraw(80);
        limitedAccount.withdraw(50);
        limitedAccount.print();
    }
}
