package com.constructor.level1;

public class CourseDriver {
	 public static void main(String[] args) {
	        Course c1 = new Course("Java Full Stack", 6, 60000);
	        Course c2 = new Course("Data Analytics", 4, 45000);

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();

	        // Update institute name for all courses
	        Course.updateInstituteName("BridgeLabz Solutions");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }
}
