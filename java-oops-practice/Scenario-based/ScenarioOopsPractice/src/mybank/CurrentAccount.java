package mybank;

public class CurrentAccount extends Account {
    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE / 100;
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: ₹" + interest);
    }
}

