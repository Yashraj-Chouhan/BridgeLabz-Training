package bookbazaar;
public class BookBazaarApp {

    public static void main(String[] args) {

        Book ebook = new EBook("Clean Code", "Robert Martin", 500);
        Book printedBook = new PrintedBook("Java Complete Reference", "Herbert Schildt", 800, 10);

        Order order = new Order("Yashraj");

        order.addItem(ebook, 2);
        order.addItem(printedBook, 3);

        order.placeOrder();

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Cost: ₹" + order.calculateTotal());
        System.out.println("Printed Book Stock Left: " + printedBook.getStock());
    }
}
