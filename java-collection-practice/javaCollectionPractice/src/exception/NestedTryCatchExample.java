package exception;
import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Sample array
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                // Array access
                int value = arr[index];

                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                try {
                    // Division
                    int result = value / divisor;
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
        }
    }
}
