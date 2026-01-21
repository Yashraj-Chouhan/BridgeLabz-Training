package generics.multileveluniversity;
class ExamCourse extends CourseType {

    @Override
    String getEvaluationType() {
        return "Exam Based";
    }

    @Override
    int getMaxMarks() {
        return 100;
    }
}
