import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // Exception occurs here
        System.out.println("Number is: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Calling method to generate exception
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated and program stopped abruptly");
        }

        // Calling method to handle runtime exception
        handleException(text);
    }
}
