package edumentor;

public class Quiz {

    private String[] questions;        // internal question bank (private)
    private final int[] answers;        // cannot be modified once set
    private int score;
    private int difficultyLevel;

    // Constructor with difficulty
    public Quiz(String[] questions, int[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
    }

    // Encapsulation: no setter for answers
    public int[] getAnswers() {
        return answers;
    }

    // Operator usage for scoring
    public void evaluateQuiz(int[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == userAnswers[i]) {
                score++;   // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / answers.length;   // operator usage
    }

    public void showResult() {
        System.out.println("Score: " + score);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}
