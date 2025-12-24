import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
	
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Choose operation: +  -  *  /");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+': System.out.println("Result: " + add(num1, num2)); break;
            case '-': System.out.println("Result: " + subtract(num1, num2)); break;
            case '*': System.out.println("Result: " + multiply(num1, num2)); break;
            case '/': System.out.println("Result: " + divide(num1, num2)); break;
            default: System.out.println("Invalid Operation");
        }

        sc.close();
    }
}
