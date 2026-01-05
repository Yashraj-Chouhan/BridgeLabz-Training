package campusconnect;

public class CampusConnectDriver {
    public static void main(String[] args) {

        Faculty faculty = new Faculty(101, "Dr. Sharma", "sharma@college.edu", "Computer Science");

        Student s1 = new Student(1, "Amit", "amit@student.edu");
        Student s2 = new Student(2, "Neha", "neha@student.edu");

        s1.addGrade(8);
        s1.addGrade(9);
        s2.addGrade(7);
        s2.addGrade(8);

        Course javaCourse = new Course("Java Programming", faculty);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        System.out.println("\n--- Details ---");
        s1.printDetails();
        System.out.println();
        faculty.printDetails();
        System.out.println();
        javaCourse.showCourseDetails();
    }
}

