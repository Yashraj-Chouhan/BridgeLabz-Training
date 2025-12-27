package com.constructor.accessmodifiers;

public class Manager extends Employee {

    String role;

    // Constructor
    public Manager(int employeeID, String department,
                   double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Method to demonstrate access modifiers
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : ₹" + getSalary()); // private via getter
        System.out.println("Role        : " + role);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Manager m = new Manager(501, "IT", 75000, "Team Lead");

        m.displayDetails();

        // Modify salary using public method
        m.setSalary(85000);
        System.out.println("Updated Salary : ₹" + m.getSalary());
    }
}

