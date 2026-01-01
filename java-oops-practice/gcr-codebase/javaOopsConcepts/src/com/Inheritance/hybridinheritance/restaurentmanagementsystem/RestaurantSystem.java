package com.Inheritance.hybridinheritance.restaurentmanagementsystem;

public class RestaurantSystem {
	 public static void main(String[] args) {

	        Worker w1 = new Chef("Ravi", 101, "Indian Cuisine");
	        Worker w2 = new Waiter("Aman", 201, 6);

	        w1.performDuties();
	        System.out.println("----------------");
	        w2.performDuties();
}
}
