package day4;
abstract class Bill implements IPayable {
    private String type;
    protected double amount;
    private String dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected double calculateLateFee() {
        double penalty = 50;
        return amount + penalty; // operator usage
    }

    public final void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println("Bill already paid.");
        }
    }

    protected boolean isPaid() {
        return isPaid;
    }
}
