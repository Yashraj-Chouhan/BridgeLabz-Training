package skillforge;
public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Anita");
        inst.uploadCourse("Java Mastery");

        Course course = new Course("Java Mastery", inst);

        Student student = new Student("Rahul");
        student.updateProgress(2, course.getTotalModules());
        student.generateCertificate();

        student.updateProgress(3, course.getTotalModules());
        student.generateCertificate();

        AdvancedCourse adv = new AdvancedCourse(
                "Advanced Java",
                inst,
                new String[]{"Streams", "Concurrency", "Projects"}
        );
        adv.generateCertificate();
    }
}
