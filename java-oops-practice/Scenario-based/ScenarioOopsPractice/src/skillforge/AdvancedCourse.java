package skillforge;
class AdvancedCourse extends Course implements ICertifiable {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Certificate with Project Evaluation issued");
    }
}
