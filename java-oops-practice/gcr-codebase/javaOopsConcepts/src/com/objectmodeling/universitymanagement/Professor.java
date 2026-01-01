package com.objectmodeling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String professorName;
    private List<Course> courses = new ArrayList<>();

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public String getProfessorName() {
        return professorName;
    }

    public void viewCourses() {
        System.out.println("Professor: " + professorName);
        for (Course c : courses) {
            System.out.println("- Teaching: " + c.getCourseName());
        }
        System.out.println();
    }
}

