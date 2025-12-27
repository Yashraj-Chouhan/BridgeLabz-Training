package com.constructor.accessmodifiers;

public class EBook extends Book {

    String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Method to demonstrate access modifiers
    public void displayDetails() {
        System.out.println("ISBN       : " + ISBN);      // public
        System.out.println("Title      : " + title);     // protected
        System.out.println("Author     : " + getAuthor()); // private via getter
        System.out.println("Format     : " + fileFormat);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", "PDF");

        eb.displayDetails();

        // Modifying private variable using public setter
        eb.setAuthor("J. Bloch");
        System.out.println("Updated Author : " + eb.getAuthor());
    }
}
