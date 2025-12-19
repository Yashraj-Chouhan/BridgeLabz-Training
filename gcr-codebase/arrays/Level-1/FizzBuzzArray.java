import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }

        // Create String array to store results
        String result[] = new String[number + 1];

        // Store FizzBuzz results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0) {
                result[i] = "Fizz";
            } 
            else if (i % 5 == 0) {
                result[i] = "Buzz";
            } 
            else {
