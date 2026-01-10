package artify;
class PrintArt extends Artwork {

    public PrintArt(String title, String artist,
                    double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void license() {
        System.out.println("Print license applied: "
                + licenseType + " (Physical Prints Allowed)");
    }
}
