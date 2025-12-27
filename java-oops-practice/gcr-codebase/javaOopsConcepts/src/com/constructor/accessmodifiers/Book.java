package com.constructor.accessmodifiers;

public class Book {

    // public variable
    public String ISBN;

    // protected variable
    protected String title;

    // private variable
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author (private member)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author (private member)
    public String getAuthor() {
        return author;
    }
}

