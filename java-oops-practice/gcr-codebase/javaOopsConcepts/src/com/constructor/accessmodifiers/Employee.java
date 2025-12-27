package com.constructor.accessmodifiers;

public class Employee {

    // public variable
    public int employeeID;

    // protected variable
    protected String department;

    // private variable
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}
