package com.constructor.level1;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book();
		Book b2=new Book("Little women","Yashaj ",100);
        System.out.println(b1.title + ", " + b1.author + ", " + b1.price);
        System.out.println(b2.title + ", " + b2.author + ", " + b2.price);
	}

}
