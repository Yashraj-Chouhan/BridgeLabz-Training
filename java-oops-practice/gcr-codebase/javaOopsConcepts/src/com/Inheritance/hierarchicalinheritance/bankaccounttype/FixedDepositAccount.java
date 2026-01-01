package com.Inheritance.hierarchicalinheritance.bankaccounttype;

public class FixedDepositAccount extends BankAccount {
	private int tenure;
	 FixedDepositAccount(int accountnumber,double balance,int tenure){
		 super(accountnumber,balance);
		 this.tenure=tenure;
	 }
	 public void displayAccountType() {
		 super.displayAccountType();
		 System.out.println("Account Type Fixed Account "+"\nTenure : "+tenure );
	 }
}
