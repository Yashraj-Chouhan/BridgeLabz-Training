package artify;
public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Aarav", 5000);

        Artwork art1 = new DigitalArt(
                "Cyber Dreams", "Riya", 1500, "Standard");

        Artwork art2 = new PrintArt(
                "Nature Bliss", "Karan", 2000, "Commercial");

        art1.purchase(user);
        art1.license();

        art2.purchase(user);
        art2.license();

        System.out.println("Remaining Wallet Balance: "
                + user.getWalletBalance());
    }
}
