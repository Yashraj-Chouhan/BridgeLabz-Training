package com.Inheritance.hierarchicalinheritance.bankaccounttype;

public class CheckingAccount extends BankAccount {
	int withdrawlLimit;
	CheckingAccount(int accountNumber,double balance,int withdrawlLimit){
		super(accountNumber,balance);
		this.withdrawlLimit=withdrawlLimit;
	}
	
	@Override
	public void displayAccountType() {
		super.displayAccountType();
		System.out.println("Account type Checking Type "+"\nWithdraw Limit : "+ withdrawlLimit);
	}
	
}
