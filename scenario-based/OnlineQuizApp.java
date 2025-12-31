/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;
public class OnlineQuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which data type is used to store true/false values?",
            "3. Which loop is guaranteed to execute at least once?",
            "4. Which method is the entry point of Java program?",
            "5. Which operator is used for object creation?"
        };

        String[][] options = {
            {"a) this", "b) super", "c) extends", "d) implements"},
            {"a) int", "b) boolean", "c) char", "d) float"},
            {"a) for", "b) while", "c) do-while", "d) foreach"},
            {"a) start()", "b) main()", "c) run()", "d) execute()"},
            {"a) new", "b) create", "c) make", "d) alloc"}
        };

        char[] correctAnswers = {'c', 'b', 'c', 'b', 'a'};

        int score = 0;

        System.out.println("----- Online Quiz Started -----\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println("Correct Answer \n");
                        score++;
                    } else {
                        System.out.println("Wrong Answer ");
                        System.out.println("Correct answer is: " + correctAnswers[i] + "\n");
                    }
                    break;

                default:
                    System.out.println("Invalid option selected\n");
            }
        }

        System.out.println("----- Quiz Completed -----");
        System.out.println("Your Final Score: " + score + "/5");

        sc.close();
    }
}
