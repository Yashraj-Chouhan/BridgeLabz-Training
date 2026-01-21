package generics.dynamiconlinemarketplace;
class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double originalPrice = product.getPrice();
        double discount = originalPrice * (percentage / 100);
        product.setPrice(originalPrice - discount);

        System.out.println(
            "Discount Applied: " + percentage + "% on " + product.getName()
        );
    }
}
