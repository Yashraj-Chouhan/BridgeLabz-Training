import java.util.Scanner;

public class VolumeOfCylinder {
    static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println(volume(radius, height));
    }
}
