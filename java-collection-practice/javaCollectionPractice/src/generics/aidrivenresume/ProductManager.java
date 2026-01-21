package generics.aidrivenresume;
class ProductManager extends JobRole {

    @Override
    String getRoleName() {
        return "Product Manager";
    }

    @Override
    int minimumExperience() {
        return 4;
    }

    @Override
    boolean isSkillMatch(String[] skills) {
        return contains(skills, "Leadership") || contains(skills, "Roadmap");
    }

    private boolean contains(String[] skills, String key) {
        for (String s : skills)
            if (s.equalsIgnoreCase(key)) return true;
        return false;
    }
}
