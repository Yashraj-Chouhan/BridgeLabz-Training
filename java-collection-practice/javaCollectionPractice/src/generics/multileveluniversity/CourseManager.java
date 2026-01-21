package generics.multileveluniversity;
import java.util.*;

class CourseManager {

    public void showCourses(List<? extends CourseType> courseTypes) {
        for (CourseType ct : courseTypes) {
            System.out.println(
                "Evaluation: " + ct.getEvaluationType() +
                ", Max Marks: " + ct.getMaxMarks()
            );
        }
    }
}
