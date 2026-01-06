package edumentor;

public class Instructor extends User {

    private String specialization;

    public Instructor(String name, String email, int userId, String specialization) {
        super(name, email, userId);
        this.specialization = specialization;
    }

    public void createCourse() {
        System.out.println("Course created by instructor: " + name);
    }
}

