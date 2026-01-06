package swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getDiscount(double totalAmount) {
        // Flat 5% discount
        return totalAmount * 0.05;
    }
}
