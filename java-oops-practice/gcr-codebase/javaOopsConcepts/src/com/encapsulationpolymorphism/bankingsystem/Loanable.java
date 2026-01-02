package com.encapsulationpolymorphism.bankingsystem;

public interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

