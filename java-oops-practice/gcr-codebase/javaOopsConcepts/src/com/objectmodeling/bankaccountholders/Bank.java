package com.objectmodeling.bankaccountholders;

public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account openAccount(int accountNumber, double initialBalance) {
        System.out.println("Account opened in " + bankName);
        return new Account(accountNumber, initialBalance);
    }

    public String getBankName() {
        return bankName;
    }
}

