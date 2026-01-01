package com.objectmodeling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.assignCourse(this);   // communication
        System.out.println("Professor " + professor.getProfessorName()
                + " assigned to " + courseName);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getProfessorName());
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
        System.out.println();
    }
}

