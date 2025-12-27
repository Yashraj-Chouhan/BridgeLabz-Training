package com.constructor.level1;

public class LibraryBook {
	 String title;
	    String author;
	    double price;
	    boolean availability;

	    // Constructor
	    public LibraryBook(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = true; // book is available by default
	    }

	    // Method to borrow a book
	    public void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } else {
	            System.out.println("Sorry, the book is currently unavailable.");
	        }
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title        : " + title);
	        System.out.println("Author       : " + author);
	        System.out.println("Price        : ₹" + price);
	        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
	        System.out.println("-----------------------------");
	    }

}
