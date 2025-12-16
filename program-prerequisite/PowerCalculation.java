import java.util.Scanner;

public class PowerCalculation {
    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        System.out.println(power(base, exponent));
    }
}
