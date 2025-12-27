package com.constructor.accessmodifiers;

public class SavingsAccount extends BankAccount {

    double interestRate;

    // Constructor
    public SavingsAccount(long accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to demonstrate access modifiers
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : ₹" + getBalance());   // private via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        SavingsAccount sa =
                new SavingsAccount(1234567890L, "Yashraj", 10000, 4.5);

        sa.displayAccountDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("Updated Balance : ₹" + sa.getBalance());
    }
}
