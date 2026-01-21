package generics.smartwarehousemanagement;
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getCategory();
}
