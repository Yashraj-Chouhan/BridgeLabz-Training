package universitycourseenrollment;

public class Postgraduate extends Student implements Graded {

    Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint = (marks >= 60) ? 4.0 : 0.0;
        setGPA(gradePoint);
    }
}

