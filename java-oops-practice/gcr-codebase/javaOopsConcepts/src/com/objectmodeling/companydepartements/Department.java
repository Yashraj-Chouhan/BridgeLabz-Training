package com.objectmodeling.companydepartements;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name)); // Composition
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}


