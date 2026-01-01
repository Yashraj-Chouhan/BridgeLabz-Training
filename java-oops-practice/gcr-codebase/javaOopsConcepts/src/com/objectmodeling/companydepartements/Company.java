package com.objectmodeling.companydepartements;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName)); // Composition
    }

    public void addEmployeeToDepartment(int deptIndex, int id, String name) {
        departments.get(deptIndex).addEmployee(id, name);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
            System.out.println();
        }
    }
}
