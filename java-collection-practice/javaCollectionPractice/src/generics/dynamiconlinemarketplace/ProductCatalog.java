package generics.dynamiconlinemarketplace;
import java.util.*;

class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends Category> product : products) {
            product.display();
        }
    }
}
