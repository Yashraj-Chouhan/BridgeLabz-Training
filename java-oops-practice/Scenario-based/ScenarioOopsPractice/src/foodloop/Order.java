package foodloop;
import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    // Constructor for normal order
    public Order() {
        items = new ArrayList<>();
    }

    // Constructor for combo meal
    public Order(List<FoodItem> comboItems) {
        items = comboItems;
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    // Polymorphic discount logic
    public double applyDiscount(double total) {
        if (total >= 1000)
            return total * 0.20;
        else if (total >= 500)
            return total * 0.10;
        else
            return 0;
    }

    @Override
    public void placeOrder() {
        total = 0;

        for (FoodItem item : items) {
            total += item.getPrice();   // operator usage
        }

        double discount = applyDiscount(total);
        total = total - discount;      // operators

        System.out.println("Order placed successfully");
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Total Payable: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled");
    }
}
