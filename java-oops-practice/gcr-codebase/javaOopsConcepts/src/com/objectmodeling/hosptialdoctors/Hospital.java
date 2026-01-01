package com.objectmodeling.hosptialdoctors;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors Available: " + doctors.size());
        System.out.println("Patients Registered: " + patients.size());
        System.out.println();
    }
}
