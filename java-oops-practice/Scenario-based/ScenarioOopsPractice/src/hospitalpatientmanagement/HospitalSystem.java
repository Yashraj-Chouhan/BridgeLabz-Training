package hospitalpatientmanagement;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 5);
        Patient p2 = new OutPatient(102, "Anita");

        Doctor d1 = new Doctor(1, "Cardiologist");

        Bill bill = new Bill(5000, 0.18, 500);
        

        p1.displayInfo();   // Polymorphism
        p2.displayInfo();

        d1.displayInfo();

        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }
}

