package com.objectmodeling.schoolstudents;

public class SchoolDriver {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        school.displayStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.displayStudents();
        c2.displayStudents();
    }
}

