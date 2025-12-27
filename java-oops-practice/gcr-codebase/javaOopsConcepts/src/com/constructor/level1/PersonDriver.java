package com.constructor.level1;

public class PersonDriver {
	   public static void main(String[] args) {
	        Person p1 = new Person("Yashraj", 21);
	        Person p2 = new Person(p1);   // cloning p1

	        System.out.println(p1.name + " " + p1.age);
	        System.out.println(p2.name + " " + p2.age);
	    }

}
