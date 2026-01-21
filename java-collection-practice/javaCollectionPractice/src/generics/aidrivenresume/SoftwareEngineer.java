package generics.aidrivenresume;
class SoftwareEngineer extends JobRole {

    @Override
    String getRoleName() {
        return "Software Engineer";
    }

    @Override
    int minimumExperience() {
        return 2;
    }

    @Override
    boolean isSkillMatch(String[] skills) {
        return contains(skills, "Java") || contains(skills, "Spring Boot");
    }

    private boolean contains(String[] skills, String key) {
        for (String s : skills)
            if (s.equalsIgnoreCase(key)) return true;
        return false;
    }
}
