package com.constructor.level1;

public class Course {
	   // Instance variables
    String courseName;
    int duration;        // in months
    double fee;

    // Class variable (shared among all courses)
    static String instituteName = "BridgeLabz";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println("-------------------------------");
    }

    // Class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

   
}
