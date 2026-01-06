package fittrack;

public class FitTrackDriver {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Yashraj",
                22,
                70.5,
                2500
        );

        user.displayProfile();

        Workout workout1 = new CardioWorkout(30);
        workout1.startWorkout();
        workout1.calculateCalories();
        workout1.stopWorkout();

        int caloriesBurned = workout1.getCaloriesBurned();

        int remainingCalories =
                user.getDailyCalorieGoal() - caloriesBurned;   // operator usage

        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Remaining Calories: " + remainingCalories);
    }
}

