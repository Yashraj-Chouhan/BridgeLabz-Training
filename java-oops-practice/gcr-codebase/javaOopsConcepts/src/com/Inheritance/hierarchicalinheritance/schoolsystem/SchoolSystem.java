package com.Inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Amit", 16, "10th Grade");
        Person p3 = new Staff("Ramesh", 45, "Administration");

        p1.displayRole();
        System.out.println("------------");
        p2.displayRole();
        System.out.println("------------");
        p3.displayRole();
    }
}

