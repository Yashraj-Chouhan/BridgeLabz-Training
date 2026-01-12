package day2.bookshelf;
import java.util.*;

class BookShelf {

    // Genre → List of Books
    private HashMap<String, LinkedList<Book>> genreMap = new HashMap<>();

    // To avoid duplicate books (optional)
    private HashSet<String> bookSet = new HashSet<>();

    // Add book (Return book)
    public void addBook(String genre, Book book) {

        // Avoid duplication
        if (bookSet.contains(book.id)) {
            System.out.println("Duplicate book ignored: " + book.title);
            return;
        }

        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        bookSet.add(book.id);

        System.out.println("Added: " + book + " to genre " + genre);
    }

    // Borrow book (Remove)
    public void borrowBook(String genre, String bookId) {

        LinkedList<Book> books = genreMap.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books available in genre: " + genre);
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.id.equals(bookId)) {
                it.remove();          // Efficient removal
                bookSet.remove(bookId);
                System.out.println("Borrowed: " + b);
                return;
            }
        }

        System.out.println("Book not found in genre: " + genre);
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (Map.Entry<String, LinkedList<Book>> entry : genreMap.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (Book b : entry.getValue()) {
                System.out.println("  - " + b);
            }
        }
    }
}
