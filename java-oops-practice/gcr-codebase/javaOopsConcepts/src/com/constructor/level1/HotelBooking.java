package com.constructor.level1;

public class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	//Default Constructor
	HotelBooking(){
		this.guestName="Yash";
		this.roomType="AC";
		this.nights=3;
	}
	//Copy Constructor
	HotelBooking(HotelBooking h){
		this.guestName=h.guestName;
		this.roomType=h.roomType;
		this.nights=h.nights;
	}
	
	// Parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights) {
			this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	}
	
	// Display Booking
	public void displayBooking() {
		System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
	}
	
	
	

	
}
