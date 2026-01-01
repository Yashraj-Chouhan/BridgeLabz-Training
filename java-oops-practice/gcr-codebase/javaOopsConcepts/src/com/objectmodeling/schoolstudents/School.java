package com.objectmodeling.schoolstudents;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }
}
