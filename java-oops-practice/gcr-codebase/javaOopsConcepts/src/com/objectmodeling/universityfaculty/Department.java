package com.objectmodeling.universityfaculty;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Faculty> faculties = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty); // Aggregation
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
        System.out.println();
    }
}
