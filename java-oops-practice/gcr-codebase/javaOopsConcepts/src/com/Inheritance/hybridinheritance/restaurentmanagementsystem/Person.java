package com.Inheritance.hybridinheritance.restaurentmanagementsystem;

public class Person {
	String name;
	int id;
	Person(String name,int id){
		this.name=name;
		this.id=id;
	}
	 public void displayPerson() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	    }
	
}
