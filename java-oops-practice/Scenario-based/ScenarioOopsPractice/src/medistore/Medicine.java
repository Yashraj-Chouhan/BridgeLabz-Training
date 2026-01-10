package medistore;

public abstract class Medicine implements ISellable {

    protected String name;
    protected int price;
    protected String expiryDate;
    protected int quantity;

    private int stocks;   // encapsulated
    private int cost;     // sensitive pricing logic

    public Medicine(String name, int price, String expiryDate,
                    int quantity, int stocks, int cost) {

        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.stocks = stocks;
        this.cost = cost;
    }

    // Encapsulated stock handling
    protected boolean reduceStock(int qty) {
        if (stocks >= qty) {
            stocks -= qty;
            return true;
        }
        return false;
    }

    protected int calculateTotalPrice(int qty) {
        return price * qty;
    }

    @Override
    public void sell(int qty) {
        if (reduceStock(qty)) {
            int total = calculateTotalPrice(qty);
            System.out.println(name + " sold. Total price: ₹" + total);
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }
}
