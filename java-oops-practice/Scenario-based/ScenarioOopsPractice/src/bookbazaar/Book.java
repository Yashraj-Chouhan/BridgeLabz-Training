package bookbazaar;
public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock; // Encapsulated

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // Inventory update only via method
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
