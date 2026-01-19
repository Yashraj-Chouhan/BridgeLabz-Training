package day4;
class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Internet bill due! Stay connected.");
    }
}
