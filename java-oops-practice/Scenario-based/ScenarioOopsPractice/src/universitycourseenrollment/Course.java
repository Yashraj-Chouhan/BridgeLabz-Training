package universitycourseenrollment;

public class Course {
    private String courseCode;
    private String title;

    Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

