package com.objectmodeling.schoolstudents;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}


