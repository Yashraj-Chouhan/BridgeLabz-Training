package day1.bookshelf;

public class BookShelfSystem {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("B101", "Java Basics", "James Gosling", "Programming"));
        library.addBook(new Book("B102", "DSA Made Easy", "Robert Lafore", "Programming"));
        library.addBook(new Book("B201", "Atomic Habits", "James Clear", "Self-Help"));
        library.addBook(new Book("B202", "Deep Work", "Cal Newport", "Self-Help"));

        // Duplicate test
        library.addBook(new Book("B101", "Java Basics", "James Gosling", "Programming"));

        library.displayLibrary();

        // Borrow book
        library.removeBook("Programming", "B102");

        library.displayLibrary();
    }
}
