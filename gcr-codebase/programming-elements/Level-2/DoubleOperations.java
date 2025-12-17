import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        // Taking input values
        Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Performing integer operations (operator precedence applies)
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Printing results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
