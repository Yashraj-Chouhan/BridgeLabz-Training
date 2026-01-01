package com.Inheritance.hierarchicalinheritance.bankaccounttype;

public class BankTypeSystem {
	public static void main(String[] args) {
		BankAccount b1=new SavingsAccount(101,5000,8.5);
		BankAccount b2=new FixedDepositAccount(102,45000,5);
		BankAccount b3=new CheckingAccount(103,8000,3000);
		
		b1.displayAccountType();
		System.out.println("------------------");
		b2.displayAccountType();
		System.out.println("-------------------");
		b3.displayAccountType();
		System.out.println("------------------");
	}
}
