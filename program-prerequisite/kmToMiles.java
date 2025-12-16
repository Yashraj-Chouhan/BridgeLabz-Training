import java.util.Scanner;

public class KmToMiles {
    static double convert(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        System.out.println(convert(kilometers));
    }
}
