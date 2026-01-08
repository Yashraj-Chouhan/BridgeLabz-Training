package bookbazaar;
public class OrderItem {

    private Book book;
    private int quantity;

    public OrderItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        double discount = book.applyDiscount(quantity);
        return (book.getPrice() * quantity) - discount;
    }

    public void confirmOrder() {
        book.reduceStock(quantity);
    }
}
