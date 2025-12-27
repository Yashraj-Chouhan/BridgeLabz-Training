package com.constructor.level1;

public class HotelBookingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelBooking h1=new HotelBooking();
		HotelBooking h2=new HotelBooking(h1);
		HotelBooking h3 = new HotelBooking("Yashraj", "Deluxe", 3);
		h1.displayBooking();
		h2.displayBooking();
		h3.displayBooking();
	}

}
