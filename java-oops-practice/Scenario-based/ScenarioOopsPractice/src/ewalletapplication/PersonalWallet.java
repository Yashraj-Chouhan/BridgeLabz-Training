package ewalletapplication;

public class PersonalWallet extends Wallet {

    PersonalWallet(User user) {
        super(user);
    }

    PersonalWallet(User user, double referralBonus) {
        super(user, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (deduct(amount)) {
            System.out.println("PersonalWallet: ₹" + amount +
                    " transferred to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

