package generics.aidrivenresume;
import java.util.*;

class ScreeningPipeline {

    public void processResumes(List<? extends Resume<? extends JobRole>> resumes) {

        for (Resume<? extends JobRole> resume : resumes) {

            boolean result = ResumeScreeningUtil.screenResume(resume);

            System.out.println(
                resume.getCandidateName() + " → " +
                resume.getJobRole().getRoleName() + " : " +
                (result ? "SHORTLISTED" : "REJECTED")
            );
        }
    }
}
