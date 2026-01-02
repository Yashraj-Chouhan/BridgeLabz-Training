package hospitalpatientmanagement;

public class Doctor {
    private int doctorId;
    private String specialization;

    Doctor(int doctorId, String specialization) {
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId + ", Specialization: " + specialization);
    }
}

