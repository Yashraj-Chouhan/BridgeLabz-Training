package ewalletapplication;

public class EWalletApp {
    public static void main(String[] args) {

        User u1 = new User("U101", "Amit");
        User u2 = new User("U102", "Neha");

        Wallet w1 = new PersonalWallet(u1, 100); // referral bonus
        Wallet w2 = new BusinessWallet(u2);

        w1.loadMoney(1000);
        w2.loadMoney(2000);

        w1.transferTo(u2, 300);
        w2.transferTo(u1, 500);

        System.out.println("Amit Balance: ₹" + w1.getBalance());
        System.out.println("Neha Balance: ₹" + w2.getBalance());
    }
}

