package swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount(double totalAmount) {
        // 10% discount on perishables
        return totalAmount * 0.10;
    }
}
