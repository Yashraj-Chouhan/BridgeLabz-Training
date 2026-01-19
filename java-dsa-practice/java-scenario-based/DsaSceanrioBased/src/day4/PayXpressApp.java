package day4;
public class PayXpressApp {
    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, "10-Feb-2026");
        Bill b2 = new WaterBill(450, "12-Feb-2026");
        Bill b3 = new InternetBill(999, "15-Feb-2026");

        b1.sendReminder();
        b1.pay();

        b2.sendReminder();
        b3.sendReminder();
    }
}
