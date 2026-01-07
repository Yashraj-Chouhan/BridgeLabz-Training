package sorting;
public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] empIds = {105, 101, 110, 102, 108};

        // Insertion Sort Logic
        for (int i = 1; i < empIds.length; i++) {

            int key = empIds[i];   // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }

        // Print sorted employee IDs
        System.out.println("Sorted Employee IDs (Ascending Order):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
