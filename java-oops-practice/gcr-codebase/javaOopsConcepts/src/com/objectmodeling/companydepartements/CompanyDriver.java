package com.objectmodeling.companydepartements;

public class CompanyDriver {
    public static void main(String[] args) {

        Company company = new Company("TechNova Pvt Ltd");

        company.addDepartment("Development");
        company.addDepartment("HR");

        company.addEmployeeToDepartment(0, 101, "Amit");
        company.addEmployeeToDepartment(0, 102, "Neha");

        company.addEmployeeToDepartment(1, 201, "Rahul");

        company.displayCompany();

        company = null; // Company deleted → Departments & Employees destroyed
    }
}

