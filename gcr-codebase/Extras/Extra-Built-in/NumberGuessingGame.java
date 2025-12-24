import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    // Method to generate computer guess
    public static int generateGuess(Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    // Method to update range based on feedback
    public static void updateRange(int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            guess = generateGuess(rand);
            System.out.println("Computer guess: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed the correct number!");
                break;
            }

            updateRange(guess, feedback);
        }

        sc.close();
    }
}
