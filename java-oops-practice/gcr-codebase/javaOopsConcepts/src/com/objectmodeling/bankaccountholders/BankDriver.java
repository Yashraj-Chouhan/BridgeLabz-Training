package com.objectmodeling.bankaccountholders;

public class BankDriver {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");

        Customer yash = new Customer("Yashraj");

        Account yashAccount = sbi.openAccount(101, 5000);

        yash.linkAccount(yashAccount);

        yash.viewBalance();
    }
}
