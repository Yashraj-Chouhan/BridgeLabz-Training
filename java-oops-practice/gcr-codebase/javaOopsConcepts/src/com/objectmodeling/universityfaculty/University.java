package com.objectmodeling.universityfaculty;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName)); // Composition
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty); // Aggregation
    }

    public void assignFacultyToDepartment(int deptIndex, Faculty faculty) {
        departments.get(deptIndex).addFaculty(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}
