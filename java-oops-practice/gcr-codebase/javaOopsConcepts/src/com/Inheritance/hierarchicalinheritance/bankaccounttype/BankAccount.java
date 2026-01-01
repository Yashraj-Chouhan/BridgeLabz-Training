package com.Inheritance.hierarchicalinheritance.bankaccounttype;

public class BankAccount {
	protected int accountNumber;
	protected double balance;
	
	BankAccount(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public  void displayAccountType() {
		System.out.println(" Account Number : "+ getAccountNumber() + " Balance "+ balance);
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
}
