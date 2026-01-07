package sorting;
public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] scores = {78, 45, 89, 62, 50};

        // Selection Sort Logic
        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        // Print sorted exam scores
        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
