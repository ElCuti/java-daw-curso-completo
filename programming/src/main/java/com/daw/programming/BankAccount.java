/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

import java.util.ArrayList;

/**
 *
 * @author Alumnado
 */
public class BankAccount {

    private int balance = 0;
    private ArrayList<Integer> activity = new ArrayList();

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        activity.add(amount);
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        activity.add(-amount);
    }

    public void print() {
        System.out.println("Current balance: " + balance);
        System.out.println("Activity in the account");
        for (int transaction : activity) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        BankAccount vipAccount = new BankAccount();
        vipAccount.deposit(100);
        vipAccount.withdraw(80);
        vipAccount.withdraw(50);
        vipAccount.print();
    }
}
