package day8.sorting;
import java.util.Arrays;

public class SmartLibrary {

    // Insertion Sort based on book titles
    static void insertionSort(String[] books) {

        for (int i = 1; i < books.length; i++) {
            String currentBook = books[i];
            int j = i - 1;

            // Shift books that come after currentBook alphabetically
            while (j >= 0 && books[j].compareToIgnoreCase(currentBook) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = currentBook;
        }
    }

    // Display sorted book list
    static void display(String[] books) {
        System.out.println("\nBorrowed Books (Alphabetically Sorted):");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        // Borrowed book titles
        String[] borrowedBooks = {
                "Operating Systems",
                "Data Structures",
                "Computer Networks",
                "Algorithms",
                "Database Systems"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(borrowedBooks));

        insertionSort(borrowedBooks);

        display(borrowedBooks);
    }
}
