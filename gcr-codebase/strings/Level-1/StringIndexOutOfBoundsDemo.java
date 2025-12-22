import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate exception
    public static String generateException(String s) {
        System.out.println(s.charAt(s.length() + 1));
        return "Exception Generated";
    }

    // Method to handle exception
    public static String exceptionHandle(String s) {
        try {
            System.out.println(s.charAt(s.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            return "Exception is Handled";
        }
        return "No Exception";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        // Generating exception
        try {
            generateException(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception is Created");
        }

        // Handling exception
        System.out.println(exceptionHandle(s));
    }
}
