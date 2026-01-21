package generics.aidrivenresume;
abstract class JobRole {

    abstract String getRoleName();

    abstract int minimumExperience();

    abstract boolean isSkillMatch(String[] skills);
}
