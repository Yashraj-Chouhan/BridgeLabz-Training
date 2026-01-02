package com.Inheritance.singleInheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert Java developer and author"
        );

        author.displayInfo();
    }
}
