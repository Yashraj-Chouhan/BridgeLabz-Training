package com.constructor.level1;

public class Product {
	String productName;
	int price;
	static int totalProducts=0;
	Product(String productName,int price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
	public void displayProductDetails() {
		System.out.println("Product Name : "+productName);
		System.out.println("Price : "+ price);
		System.out.println("-------------------------");
		
	}
	static public void displayTotalProducts() {
		System.out.println(totalProducts);
	}
}
