package com.constructor.accessmodifiers;

public class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method to demonstrate protected access
    public void displayDetails() {
        System.out.println("Roll Number   : " + rollNumber); // public
        System.out.println("Name          : " + name);       // protected
        System.out.println("CGPA          : " + getCgpa());  // private via getter
        System.out.println("Specialization: " + specialization);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Yashraj", 8.6, "Computer Science");

        pg.displayDetails();

        // Modifying CGPA using public method
        pg.setCgpa(9.1);
        System.out.println("Updated CGPA  : " + pg.getCgpa());
    }
}

