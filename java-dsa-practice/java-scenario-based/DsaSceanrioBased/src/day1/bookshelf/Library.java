package day1.bookshelf;

import java.util.*;

public class Library {

    // Genre → List of Books
    private HashMap<String, LinkedList<Book>> genreMap;

    // To avoid duplicate books
    private HashSet<String> bookSet;

    public Library() {
        genreMap = new HashMap<>();
        bookSet = new HashSet<>();
    }

    // Add / Return Book
    public void addBook(Book book) {

        if (bookSet.contains(book.getBookId())) {
            System.out.println("❌ Book already exists: " + book.getBookId());
            return;
        }

        genreMap.putIfAbsent(book.getGenre(), new LinkedList<>());
        genreMap.get(book.getGenre()).add(book);

        bookSet.add(book.getBookId());
        System.out.println("✅ Book added: " + book.getTitle());
    }

    // Borrow / Remove Book
    public void removeBook(String genre, String bookId) {

        if (!genreMap.containsKey(genre)) {
            System.out.println("❌ Genre not found");
            return;
        }

        LinkedList<Book> books = genreMap.get(genre);
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId().equals(bookId)) {
                iterator.remove();
                bookSet.remove(bookId);
                System.out.println("📕 Book borrowed: " + book.getTitle());
                return;
            }
        }

        System.out.println("❌ Book not found");
    }

    // Display library
    public void displayLibrary() {
        System.out.println("\n📚 Library Catalog");
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreMap.get(genre)) {
                System.out.println("   " + book);
            }
        }
    }
}
