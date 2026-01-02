package universitycourseenrollment;

abstract class Student {
    protected int id;
    protected String name;
    protected String elective;
    private double gpa;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, String elective) {
        this(id, name);
        this.elective = elective;
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}
