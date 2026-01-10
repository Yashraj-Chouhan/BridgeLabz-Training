package artify;
class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist,
                      double price, String licenseType) {
        super(title, artist, price, licenseType, true);
    }

    @Override
    public void license() {
        System.out.println("Digital license applied: "
                + licenseType + " (Online Use Only)");
    }
}
