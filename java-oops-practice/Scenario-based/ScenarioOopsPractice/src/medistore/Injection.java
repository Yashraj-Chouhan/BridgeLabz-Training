package medistore;

public class Injection extends Medicine {

    public Injection(String name, int price, String expiryDate,
                     int quantity, int stocks, int cost) {

        super(name, price, expiryDate, quantity, stocks, cost);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Injection requires cold storage. Expiry: " + expiryDate);
    }
}
