package com.objectmodeling.libraryandbooks;

public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Head First Java", "Kathy Sierra");

        Library centralLibrary = new Library("Central Library");
        Library collegeLibrary = new Library("College Library");

        centralLibrary.addBook(b1);
        centralLibrary.addBook(b2);

        collegeLibrary.addBook(b2); // Same book in another library
        collegeLibrary.addBook(b3);

        centralLibrary.displayLibraryBooks();
        collegeLibrary.displayLibraryBooks();
    }
}
