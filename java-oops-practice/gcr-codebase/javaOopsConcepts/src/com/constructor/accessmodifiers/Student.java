package com.constructor.accessmodifiers;

public class Student {

    // public variable
    public int rollNumber;

    // protected variable
    protected String name;

    // private variable
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Public setter for CGPA
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value");
        }
    }
}
