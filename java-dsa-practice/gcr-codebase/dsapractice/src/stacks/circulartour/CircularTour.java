package stacks.circulartour;
public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {

        int start = 0;
        int balance = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {

            balance += petrol[i] - distance[i];

            // If balance becomes negative, cannot start from current start
            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        // Final check
        if (balance + deficit >= 0) {
            return start;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStartingPoint(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + result);
    }
}
