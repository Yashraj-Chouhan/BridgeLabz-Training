package ewalletapplication;

public abstract class Wallet implements Transferrable {
    protected User user;
    private double balance;

    Wallet(User user) {
        this.user = user;
    }

    Wallet(User user, double referralBonus) {
        this.user = user;
        this.balance += referralBonus;
    }

    public void loadMoney(double amount) {
        balance += amount;
    }

    protected boolean deduct(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
