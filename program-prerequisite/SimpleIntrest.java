import java.util.Scanner;

public class SimpleInterest {
    static double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println(calculate(principal, rate, time));
    }
}
