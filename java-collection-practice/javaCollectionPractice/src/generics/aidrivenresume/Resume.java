package generics.aidrivenresume;
class Resume<T extends JobRole> {

    private String candidateName;
    private int experience;
    private String[] skills;
    private T jobRole;

    public Resume(String candidateName, int experience, String[] skills, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.skills = skills;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public int getExperience() {
        return experience;
    }

    public String[] getSkills() {
        return skills;
    }

    public String getCandidateName() {
        return candidateName;
    }
}
