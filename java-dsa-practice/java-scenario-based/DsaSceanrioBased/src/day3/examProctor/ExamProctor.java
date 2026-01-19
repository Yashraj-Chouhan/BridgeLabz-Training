package Day3.examProctor;
import java.util.*;

public class ExamProctor {

    // Stack to track navigation
    Stack<Integer> navigationStack = new Stack<>();

    // Map to store student answers (questionID -> answer)
    HashMap<Integer, String> answerMap = new HashMap<>();

    // Map for correct answers
    HashMap<Integer, String> correctAnswerMap = new HashMap<>();

    // Constructor: load correct answers
    public ExamProctor() {
        correctAnswerMap.put(1, "A");
        correctAnswerMap.put(2, "B");
        correctAnswerMap.put(3, "C");
        correctAnswerMap.put(4, "D");
    }

    // 🔹 Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // 🔹 Answer a question
    public void answerQuestion(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answered Q" + questionId + ": " + answer);
    }

    // 🔹 Go back to last question
    public void goBack() {
        if (!navigationStack.isEmpty()) {
            int lastQuestion = navigationStack.pop();
            System.out.println("Going back from Question: " + lastQuestion);
        } else {
            System.out.println("No previous question");
        }
    }

    // 🔹 Evaluate score (Function)
    public int evaluateScore() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : correctAnswerMap.entrySet()) {
            int qId = entry.getKey();
            String correctAnswer = entry.getValue();

            if (answerMap.containsKey(qId) &&
                answerMap.get(qId).equals(correctAnswer)) {
                score++;
            }
        }
        return score;
    }

    // 🔹 Submit exam
    public void submitExam() {
        System.out.println("\nExam Submitted");
        int totalScore = evaluateScore();
        System.out.println("Final Score: " + totalScore + "/" + correctAnswerMap.size());
    }
}
