package com.objectmodeling.companydepartements;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

