package com.objectmodeling.schoolstudents;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}

