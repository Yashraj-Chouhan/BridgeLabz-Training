package medistore;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine m1 = new Tablet("Paracetamol", 5, "2026-01-10", 10, 100, 2);
        Medicine m2 = new Syrup("Cough Syrup", 120, "2025-06-15", 1, 30, 70);
        Medicine m3 = new Injection("Insulin", 500, "2025-03-01", 1, 20, 300);

        m1.sell(10);
        m2.sell(2);
        m3.sell(1);

        m1.checkExpiry();
        m2.checkExpiry();
        m3.checkExpiry();
    }
}
