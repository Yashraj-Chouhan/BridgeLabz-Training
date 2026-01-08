package bookbazaar;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String userName;
    private List<OrderItem> items = new ArrayList<>();
    private String status = "CREATED"; // restricted

    public Order(String userName) {
        this.userName = userName;
    }

    public void addItem(Book book, int quantity) {
        items.add(new OrderItem(book, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public void placeOrder() {
        for (OrderItem item : items) {
            item.confirmOrder();
        }
        updateStatus("CONFIRMED");
    }
}
