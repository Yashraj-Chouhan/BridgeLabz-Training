package generics.multileveluniversity;
class ResearchCourse extends CourseType {

    @Override
    String getEvaluationType() {
        return "Research Based";
    }

    @Override
    int getMaxMarks() {
        return 200;
    }
}
