package com.objectmodeling.bankaccountholders;

public class Customer {
    private String customerName;
    private Account account;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void linkAccount(Account account) {
        this.account = account;
    }

    public void viewBalance() {
        System.out.println(customerName + "'s Balance: ₹" + account.getBalance());
    }
}

