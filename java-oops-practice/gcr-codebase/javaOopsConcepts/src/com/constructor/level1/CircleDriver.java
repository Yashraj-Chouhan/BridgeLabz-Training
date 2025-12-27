package com.constructor.level1;

public class CircleDriver {
	 public static void main(String[] args) {
	        Circle c1 = new Circle();
	        Circle c2 = new Circle(5.5);

	        System.out.println("Default Radius: " + c1.radius);
	        System.out.println("User Radius: " + c2.radius);
}
}
