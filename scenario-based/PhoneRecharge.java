package corejavapractice;
import java.util.Scanner;

public class PhoneRecharge{

    // Initial wallet balance
    static final double INITIAL_BALANCE = 100.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = INITIAL_BALANCE;

        System.out.println("📱 Phone Recharge Simulator");
        System.out.println("----------------------------");

        while (true) {
            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. Exit");

            int operator = sc.nextInt();

            if (operator == 4) {
                System.out.println("Thank you for using Recharge Simulator");
                break;
            }

            System.out.print("Enter recharge amount: Rs ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid recharge amount");
                continue;
            }

            balance += amount;

            // Display offers using switch
            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: Extra 1GB data valid for 1 day");
                    break;
                case 2:
                    System.out.println("Airtel Offer: Unlimited calls for 24 hours");
                    break;
                case 3:
                    System.out.println("VI Offer: 2GB extra data valid for today");
                    break;
                default:
                    System.out.println("Invalid operator selection");
                    continue;
            }

            // Show balance after each recharge
            System.out.println("Recharge Successful!");
            System.out.println("Current Balance: Rs " + balance);
        }

        sc.close();
    }
}
