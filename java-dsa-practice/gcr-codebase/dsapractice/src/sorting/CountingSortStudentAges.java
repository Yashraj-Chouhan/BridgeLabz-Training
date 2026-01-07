package sorting;
public class CountingSortStudentAges {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 18, 14, 12, 11};

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        // Step 1: Count array
        int[] count = new int[range];

        // Step 2: Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 3: Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Output array
        int[] output = new int[ages.length];

        // Step 5: Place elements in correct position (right to left for stability)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Step 6: Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }

        // Print sorted ages
        System.out.println("Sorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
