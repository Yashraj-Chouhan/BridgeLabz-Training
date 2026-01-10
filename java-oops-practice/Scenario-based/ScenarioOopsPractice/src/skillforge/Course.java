package skillforge;
import java.util.Arrays;

class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private String[] internalReviews; // read-only

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Introduction", "Basics", "Final Project"});
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
        this.internalReviews = new String[]{"Well structured", "Good content"};
    }

    // Protected rating logic (encapsulation)
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;   // operator usage
        }
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public String[] getInternalReviews() {
        return Arrays.copyOf(internalReviews, internalReviews.length);
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }
}
