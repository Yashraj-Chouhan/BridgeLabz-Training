package generics.dynamiconlinemarketplace;
public class MarketplaceApp {

    public static void main(String[] args) {

        Product<BookCategory> book =
            new Product<>("Java Fundamentals", 499, new BookCategory());

        Product<ClothingCategory> shirt =
            new Product<>("T-Shirt", 899, new ClothingCategory());

        Product<GadgetCategory> phone =
            new Product<>("Smartphone", 19999, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\n--- Product Catalog ---");
        catalog.showCatalog();
    }
}
