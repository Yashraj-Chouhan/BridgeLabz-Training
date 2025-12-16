import java.util.Scanner;

public class PerimeterOfRectangle {
    static double perimeter(double l, double w) {
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println(perimeter(length, width));
    }
}
