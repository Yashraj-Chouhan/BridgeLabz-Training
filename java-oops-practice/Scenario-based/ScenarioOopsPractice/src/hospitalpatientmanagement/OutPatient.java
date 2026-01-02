package hospitalpatientmanagement;

public class OutPatient extends Patient {

    OutPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + name);
    }
}

