package com.encapsulationpolymorphism.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 =
                new FullTimeEmployee(101, "Rahul", 50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 =
                new PartTimeEmployee(102, "Anita", 80, 500);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: "
                    + ((Department) emp).getDepartmentDetails());
            System.out.println("----------------------");
        }
    }
}
