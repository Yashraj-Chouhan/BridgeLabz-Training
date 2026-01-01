package com.objectmodeling.hosptialdoctors;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String patientName;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public String getPatientName() {
        return patientName;
    }

    public void viewDoctors() {
        System.out.println("Patient: " + patientName);
        for (Doctor d : doctors) {
            System.out.println("- Consulted Dr. " + d.getDoctorName());
        }
        System.out.println();
    }
}

