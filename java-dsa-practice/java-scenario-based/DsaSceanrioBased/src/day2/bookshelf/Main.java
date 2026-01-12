package day2.bookshelf;
public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("B101", "The Alchemist", "Paulo Coelho"));
        shelf.addBook("Fiction", new Book("B102", "1984", "George Orwell"));
        shelf.addBook("Science", new Book("B201", "A Brief History of Time", "Stephen Hawking"));

        shelf.displayCatalog();

        System.out.println();
        shelf.borrowBook("Fiction", "B102");

        shelf.displayCatalog();

        // Duplicate check
        shelf.addBook("Fiction", new Book("B101", "The Alchemist", "Paulo Coelho"));
    }
}
