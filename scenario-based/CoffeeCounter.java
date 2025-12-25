import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        double price = 0;
        final double GST_RATE = 0.05; // 5% GST

        while (true) {
            System.out.print("Enter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            switch (coffeeType) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type. Try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("Total Amount: ₹" + total);
            System.out.println("GST (5%): ₹" + gst);
            System.out.println("Final Bill: ₹" + finalBill);
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}
