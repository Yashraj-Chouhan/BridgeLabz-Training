import java.util.Scanner;

public class LeapYearCheck {

    // Method to check leap year
    static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
        } else if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is not a Leap Year.");
        }

        sc.close();
    }
}
