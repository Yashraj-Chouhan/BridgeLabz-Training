package com.objectmodeling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Course> courses = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);   // communication
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public String getStudentName() {
        return studentName;
    }

    public void viewCourses() {
        System.out.println("Student: " + studentName);
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
        System.out.println();
    }
}

