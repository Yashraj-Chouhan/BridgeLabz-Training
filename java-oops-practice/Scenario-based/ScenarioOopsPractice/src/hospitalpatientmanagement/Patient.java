package hospitalpatientmanagement;

public class Patient {
    protected int id;
    protected String name;
    private String medicalHistory;
    protected boolean emergency;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.emergency = false;
    }

    Patient(int id, String name, boolean emergency) {
        this.id = id;
        this.name = name;
        this.emergency = emergency;
    }

    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    public String getSummary() {
        return "Patient ID: " + id + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

	

