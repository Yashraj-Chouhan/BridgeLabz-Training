package corejavapractice;
import java.util.Scanner;

public class ShopkeepersDiscount {

    // Discount constants
    static final double DISCOUNT_30 = 0.30;
    static final int MAX_DISCOUNT_2000 = 500;
    static final int FLAT_DISCOUNT_3000 = 1000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalBill = 0;
        double discount = 0;

        System.out.println("🛍️ Shopkeeper’s Discount Dashboard");
        System.out.println("----------------------------------");
        System.out.println("Discount Rules:");
        System.out.println("• 30% discount on bill above Rs 2000 (Max Rs 500)");
        System.out.println("• Flat Rs 1000 discount on bill above Rs 3000\n");

        System.out.print("Enter number of items purchased: ");
        int items = sc.nextInt();

        // Taking item prices using for-loop
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        // Discount calculation using if-else
        if (totalBill > 3000) {
            discount = FLAT_DISCOUNT_3000;
        } else if (totalBill > 2000) {
            discount = totalBill * DISCOUNT_30;
            if (discount > MAX_DISCOUNT_2000) {
                discount = MAX_DISCOUNT_2000;
            }
        } else {
            discount = 0;
        }

        // Final bill summary
        System.out.println("\n--------- Bill Summary ---------");
        System.out.println("Total Bill Amount : Rs " + totalBill);
        System.out.println("Discount Applied  : Rs " + discount);
        System.out.println("Payable Amount    : Rs " + (totalBill - discount));

        sc.close();
    }
}
