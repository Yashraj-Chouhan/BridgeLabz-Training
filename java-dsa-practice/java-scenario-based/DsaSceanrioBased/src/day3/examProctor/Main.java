package Day3.examProctor;
public class Main {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "C");

        exam.goBack(); // navigation using stack

        exam.visitQuestion(4);
        exam.answerQuestion(4, "D");

        exam.submitExam();
    }
}
