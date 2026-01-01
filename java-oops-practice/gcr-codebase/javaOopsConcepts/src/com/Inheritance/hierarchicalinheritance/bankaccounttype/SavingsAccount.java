package com.Inheritance.hierarchicalinheritance.bankaccounttype;

public class SavingsAccount extends BankAccount {
		double intrestRate;
		SavingsAccount(int accountNumber,double balance,double intrestRate){
			super(accountNumber,balance);
			this.intrestRate=intrestRate;
		}
		public void displayAccountType() {
			super.displayAccountType();
			System.out.println("Account Type Savings Account "+"\nIntreset Rate "+ intrestRate);
		}
}
