import java.util.Scanner;

public class TemperatureConverter {

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));

        sc.close();
    }
}
