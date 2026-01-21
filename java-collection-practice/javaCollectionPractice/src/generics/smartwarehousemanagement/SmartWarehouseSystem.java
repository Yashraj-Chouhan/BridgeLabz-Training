package generics.smartwarehousemanagement;
public class SmartWarehouseSystem {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics Items:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGrocery Items:");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
