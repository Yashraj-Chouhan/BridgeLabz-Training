package gamebox;
abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for free / paid games
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Operator usage – seasonal discount
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }
}
