package day5.sorting;
class SmartShelf {

    static void insertionSort(String[] books) {
        for (int i = 1; i < books.length; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift titles that are alphabetically greater
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] readingList = {
            "Data Structures",
            "Java Basics",
            "Algorithms",
            "Operating Systems"
        };

        insertionSort(readingList);

        for (String book : readingList) {
            System.out.println(book);
        }
    }
}
