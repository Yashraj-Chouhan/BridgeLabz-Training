package medistore;

public class Tablet extends Medicine {

    public Tablet(String name, int price, String expiryDate,
                  int quantity, int stocks, int cost) {

        super(name, price, expiryDate, quantity, stocks, cost);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Tablet expiry date: " + expiryDate);
    }
}
