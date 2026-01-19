package day4;
class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water bill pending! Ensure uninterrupted supply.");
    }
}
