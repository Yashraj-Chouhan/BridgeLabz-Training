package generics.multileveluniversity;
class AssignmentCourse extends CourseType {

    @Override
    String getEvaluationType() {
        return "Assignment Based";
    }

    @Override
    int getMaxMarks() {
        return 50;
    }
}
