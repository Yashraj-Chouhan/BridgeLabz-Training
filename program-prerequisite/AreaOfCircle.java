import java.util.Scanner;

public class AreaOfCircle {
    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(area(radius));
    }
}
