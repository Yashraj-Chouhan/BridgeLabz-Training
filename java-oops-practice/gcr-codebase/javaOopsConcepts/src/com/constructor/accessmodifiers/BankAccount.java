package com.constructor.accessmodifiers;

public class BankAccount {

    // public variable
    public long accountNumber;

    // protected variable
    protected String accountHolder;

    // private variable
    private double balance;

    // Constructor
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter (deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public setter (withdraw)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }
}

