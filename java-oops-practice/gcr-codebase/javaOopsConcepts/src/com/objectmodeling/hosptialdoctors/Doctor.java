package com.objectmodeling.hosptialdoctors;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String doctorName;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this); // bidirectional association

        System.out.println("Dr. " + doctorName + " is consulting patient " 
                           + patient.getPatientName());
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void viewPatients() {
        System.out.println("Doctor: Dr. " + doctorName);
        for (Patient p : patients) {
            System.out.println("- Patient: " + p.getPatientName());
        }
        System.out.println();
    }
}

