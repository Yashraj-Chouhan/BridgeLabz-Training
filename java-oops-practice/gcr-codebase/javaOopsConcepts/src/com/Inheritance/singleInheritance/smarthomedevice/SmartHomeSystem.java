package com.Inheritance.singleInheritance.smarthomedevice;

public class SmartHomeSystem {
	 public static void main(String[] args) {
	        Thermostat thermostat = new Thermostat(
	                "THERMO-101",
	                "ON",
	                24
	        );

	        thermostat.displayStatus();
	    }
}
