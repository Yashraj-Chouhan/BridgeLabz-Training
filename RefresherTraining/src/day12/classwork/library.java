package day12.classwork;

class Book {
    String title;
    String author;
    String isbn;

    static int totalBooksInLibrary = 0;
    static int totalBooksCheckedOut = 0;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooksInLibrary++;
    }

    void checkOut() {
        totalBooksCheckedOut++;
    }

    void returnBook() {
        totalBooksCheckedOut--;
    }
}

    public static void main(String[] args) {
        Book b1 = new Book("Book 1", "Author 1", "ISBN001");
        Book b2 = new Book("Book 2", "Author 2", "ISBN002");
        Book b3 = new Book("Book 3", "Author 3", "ISBN003");
        Book b4 = new Book("Book 4", "Author 4", "ISBN004");
        Book b5 = new Book("Book 5", "Author 5", "ISBN005");

        b1.checkOut();
        b2.checkOut();
        b3.checkOut();

        b1.returnBook();

        System.out.println(Book.totalBooksInLibrary);
        System.out.println(Book.totalBooksCheckedOut);
    }
