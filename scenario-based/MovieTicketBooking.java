import java.util.Scanner;

public class MovieTicketBooking {

    static Scanner sc = new Scanner(System.in);
    static int totalBill = 0;

    public static void seatType() {
        int choice;
        do {
            System.out.println(
                    "\nSelect Seat Type" +
                    "\n1. Golden Seat   Rs.199" +
                    "\n2. Silver Seat   Rs.149" +
                    "\n3. Recliner Seat Rs.249");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> totalBill += 199;
                case 2 -> totalBill += 149;
                case 3 -> totalBill += 249;
                default -> System.out.println("Invalid Seat Choice");
            }
        } while (choice < 1 || choice > 3);
    }

    public static void snacks() {
        System.out.print("\nDo you want snacks? (yes/no): ");
        String snackChoice = sc.next().toLowerCase();

        if (!snackChoice.equals("yes")) return;

        while (true) {
            System.out.println(
                    "\nSelect Snack" +
                    "\n1. Pizza       Rs.150" +
                    "\n2. Burger      Rs.50" +
                    "\n3. Cold Drink  Rs.80" +
                    "\n4. Momo        Rs.90" +
                    "\n0. Exit Snacks");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> totalBill += 150;
                case 2 -> totalBill += 50;
                case 3 -> totalBill += 80;
                case 4 -> totalBill += 90;
                case 0 -> {
                    System.out.println("Snack selection completed");
                    return;
                }
                default -> System.out.println("Invalid Snack Choice");
            }
        }
    }

    public static void main(String[] args) {

        String moreCustomers = "yes";

        do {
            totalBill = 0;

            System.out.println(
                    "\nSelect Movie Type" +
                    "\n1. Comedy" +
                    "\n2. Horror" +
                    "\n3. Action" +
                    "\n4. Drama");
            System.out.print("Enter your choice: ");

            int movieChoice = sc.nextInt();

            switch (movieChoice) {
                case 1 -> System.out.println("Comedy Movie Selected");
                case 2 -> System.out.println("Horror Movie Selected");
                case 3 -> System.out.println("Action Movie Selected");
                case 4 -> System.out.println("Drama Movie Selected");
                default -> {
                    System.out.println("Invalid Movie Choice");
                    continue;
                }
            }

            seatType();
            snacks();

            System.out.println("\nTotal Bill = Rs. " + totalBill);

            System.out.print("\nNext customer? (yes/no): ");
            moreCustomers = sc.next().toLowerCase();

        } while (moreCustomers.equals("yes"));

        System.out.println("\nThank you for Using Smart Movie Booking System ");
    }
}
