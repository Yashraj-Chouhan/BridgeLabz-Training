package com.constructor.level1;

public class LibraryBookDriver {
	public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Effective Java", "Joshua Bloch", 550);

        b1.displayBookDetails();
        b1.borrowBook();
        b1.displayBookDetails();
        b1.borrowBook();
    }
}
