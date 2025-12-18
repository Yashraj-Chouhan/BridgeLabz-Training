import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
		
		// start the counter
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Launch!");
    }
}
