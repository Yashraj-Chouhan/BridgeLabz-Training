package generics.aidrivenresume;
class DataScientist extends JobRole {

    @Override
    String getRoleName() {
        return "Data Scientist";
    }

    @Override
    int minimumExperience() {
        return 3;
    }

    @Override
    boolean isSkillMatch(String[] skills) {
        return contains(skills, "Python") || contains(skills, "Machine Learning");
    }

    private boolean contains(String[] skills, String key) {
        for (String s : skills)
            if (s.equalsIgnoreCase(key)) return true;
        return false;
    }
}
