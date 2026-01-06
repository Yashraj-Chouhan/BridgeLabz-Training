package edumentor;
public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Yashraj",
                "yashraj@email.com",
                101,
                true
        );

        learner.displayUser();

        String[] questions = {
                "What is OOP?",
                "What is inheritance?"
        };

        int[] correctAnswers = {1, 2};
        int[] userAnswers = {1, 2};

        Quiz quiz = new Quiz(questions, correctAnswers, 3);

        quiz.evaluateQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();
    }
}

