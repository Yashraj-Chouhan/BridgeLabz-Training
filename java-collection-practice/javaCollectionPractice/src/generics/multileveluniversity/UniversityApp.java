package generics.multileveluniversity;
import java.util.*;

public class UniversityApp {

    public static void main(String[] args) {

        Course<ExamCourse> math =
            new Course<>("Mathematics", "Science", new ExamCourse());

        Course<AssignmentCourse> cs =
            new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
            new Course<>("AI Research", "Research", new ResearchCourse());

        math.displayCourseDetails();
        cs.displayCourseDetails();
        phd.displayCourseDetails();

        List<CourseType> evaluations = new ArrayList<>();
        evaluations.add(new ExamCourse());
        evaluations.add(new AssignmentCourse());
        evaluations.add(new ResearchCourse());

        CourseManager manager = new CourseManager();

        System.out.println("\n--- Evaluation Types ---");
        manager.showCourses(evaluations);
    }
}
