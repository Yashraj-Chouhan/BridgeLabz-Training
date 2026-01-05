package mybank;

import java.util.Scanner;

public class MyBankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Welcome to MyBank");
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.calculateInterest(); // polymorphism
                    break;

                case 5:
                    System.out.println("Thank you for using MyBank!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 5);

        sc.close();
    }
}
