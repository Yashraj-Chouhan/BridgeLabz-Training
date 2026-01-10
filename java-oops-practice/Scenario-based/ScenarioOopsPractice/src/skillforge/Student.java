package skillforge;
class Student extends User implements ICertifiable {

    private int progress;   // percentage

    public Student(String name) {
        super(name);
        this.progress = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operators
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public void generateCertificate() {
        if (progress >= 60) {
            System.out.println("Certificate issued to student: " + name);
        } else {
            System.out.println("Course not completed yet");
        }
    }
}
