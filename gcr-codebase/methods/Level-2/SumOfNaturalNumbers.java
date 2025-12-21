import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum
    static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method using formula n*(n+1)/2
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Result is correct. Both methods give the same output.");
        } else {
            System.out.println("Result is incorrect. Outputs do not match.");
        }

        sc.close();
    }
}
