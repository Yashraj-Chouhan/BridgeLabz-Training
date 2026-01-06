package swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private ArrayList<Integer> quantities;
    private double totalPrice;

    // Default constructor
    public Cart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(Product product, int quantity) {
        this();
        addProduct(product, quantity);
    }

    // Only Cart can update prices
    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice() * quantities.get(i);
        }
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product product : products) {
            discount += product.getDiscount(totalPrice);
        }

        totalPrice = totalPrice - discount;   // operator usage
        System.out.println("Discount Applied: ₹" + discount);
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName() +
                    " x " + quantities.get(i));
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}
