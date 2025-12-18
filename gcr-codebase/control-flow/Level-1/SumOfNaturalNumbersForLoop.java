import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		
		// Check for natural number
        if (n > 0) {   
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop = sumForLoop + i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            if (sumForLoop == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("Please enter a natural number (greater than 0).");
        }

        sc.close();
    }
}
