package universitycourseenrollment;

public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Amit");
        Student s2 = new Postgraduate(102, "Neha", "AI");

        Course c1 = new Course("CS101", "Data Structures");

        Faculty f1 = new Faculty("Dr. Sharma");

        f1.gradeStudent((Graded) s1, 78);
        f1.gradeStudent((Graded) s2, 65);

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        e1.showEnrollment();
        e2.showEnrollment();
    }
}
