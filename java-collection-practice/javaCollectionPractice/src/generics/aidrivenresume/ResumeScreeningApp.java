package generics.aidrivenresume;
import java.util.*;

public class ResumeScreeningApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
            new Resume<>("Amit", 3,
                new String[]{"Java", "Spring Boot"}, new SoftwareEngineer());

        Resume<DataScientist> r2 =
            new Resume<>("Neha", 2,
                new String[]{"Python", "ML"}, new DataScientist());

        Resume<ProductManager> r3 =
            new Resume<>("Rahul", 5,
                new String[]{"Leadership", "Roadmap"}, new ProductManager());

        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(r1);
        resumes.add(r2);
        resumes.add(r3);

        ScreeningPipeline pipeline = new ScreeningPipeline();

        System.out.println("--- Screening Results ---");
        pipeline.processResumes(resumes);
    }
}
