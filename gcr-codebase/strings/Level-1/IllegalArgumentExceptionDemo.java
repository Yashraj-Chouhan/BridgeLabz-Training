import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate Runtime Exception
    public static void generateException(String text) {
        // start index > end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
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
