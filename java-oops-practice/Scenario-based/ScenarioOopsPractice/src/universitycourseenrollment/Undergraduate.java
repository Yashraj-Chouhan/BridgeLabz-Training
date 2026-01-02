package universitycourseenrollment;

public class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint;
        if (marks >= 85) gradePoint = 4.0;
        else if (marks >= 70) gradePoint = 3.0;
        else if (marks >= 55) gradePoint = 2.0;
        else gradePoint = 0.0;

        setGPA(gradePoint);
    }
}

