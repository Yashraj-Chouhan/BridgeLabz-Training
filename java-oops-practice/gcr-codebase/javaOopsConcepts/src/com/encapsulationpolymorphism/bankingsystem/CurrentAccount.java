package com.encapsulationpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // 1% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Business loan applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10; // Higher eligibility
    }
}

