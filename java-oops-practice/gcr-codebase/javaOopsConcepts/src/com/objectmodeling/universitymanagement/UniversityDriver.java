package com.objectmodeling.universitymanagement;

public class UniversityDriver{
    public static void main(String[] args) {

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Mehta");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        s1.viewCourses();
        s2.viewCourses();

        p1.viewCourses();
        p2.viewCourses();

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

