package edumentor;

public class Learner extends User implements ICertifiable {

    private boolean isFullTimeCourse;

    public Learner(String name, String email, int userId, boolean isFullTimeCourse) {
        super(name, email, userId);
        this.isFullTimeCourse = isFullTimeCourse;
    }

    @Override
    public void generateCertificate() {
        if (isFullTimeCourse) {
            System.out.println("🎓 Full-Time Course Certificate Generated");
        } else {
            System.out.println("📄 Short Course Certificate Generated");
        }
    }
}

