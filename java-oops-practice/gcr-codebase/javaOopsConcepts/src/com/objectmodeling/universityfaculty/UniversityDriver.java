package com.objectmodeling.universityfaculty;

public class UniversityDriver {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");

        University university = new University("National Tech University");

        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.assignFacultyToDepartment(0, f1);
        university.assignFacultyToDepartment(1, f2);

        university.displayUniversity();

        university = null; // University deleted → Departments deleted

        // Faculty objects still exist
        f1.displayFaculty();
        f2.displayFaculty();
    }
}

