package medistore;

public class Syrup extends Medicine {

    public Syrup(String name, int price, String expiryDate,
                 int quantity, int stocks, int cost) {

        super(name, price, expiryDate, quantity, stocks, cost);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Syrup expires earlier after opening. Expiry: " + expiryDate);
    }
}
