/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class LimitedBankAccount extends BankAccount {

    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("FORBIDEN: There is not enough balance");
        } else {
            super.withdraw(amount);
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
