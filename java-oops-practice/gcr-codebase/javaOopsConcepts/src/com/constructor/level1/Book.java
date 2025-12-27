package com.constructor.level1;

public class Book {
	String title;
	String author;
	int price;
	Book(){
		this.title="Power OF 48 Laws";
		this.author="Yashraj Chouhan";
		this.price=149;
	}
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}

}
