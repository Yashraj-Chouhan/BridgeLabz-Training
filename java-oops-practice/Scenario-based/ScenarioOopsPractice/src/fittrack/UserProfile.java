package fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;     // protected via encapsulation
    private int dailyCalorieGoal;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);   // default goal
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Getter only (no direct modification)
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Daily Goal: " + dailyCalorieGoal + " kcal");
    }
}

