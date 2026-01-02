package ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double SERVICE_CHARGE_RATE = 0.02;

    BusinessWallet(User user) {
        super(user);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double serviceCharge = amount * SERVICE_CHARGE_RATE;
        double total = amount + serviceCharge;

        if (deduct(total)) {
            System.out.println("BusinessWallet: ₹" + amount +
                    " transferred to " + receiver.getName());
            System.out.println("Service charge applied: ₹" + serviceCharge);
        } else {
            System.out.println("Insufficient balance (including charges)");
        }
    }
}

