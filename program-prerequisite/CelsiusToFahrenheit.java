import java.util.Scanner;

public class CelsiusToFahrenheit {
    static double convert(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println(convert(celsius));
    }
}
