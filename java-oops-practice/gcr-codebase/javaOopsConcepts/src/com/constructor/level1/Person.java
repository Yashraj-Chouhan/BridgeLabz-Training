package com.constructor.level1;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(Person p) {
		this.name=p.name;
		this.age=p.age;
	}
}
