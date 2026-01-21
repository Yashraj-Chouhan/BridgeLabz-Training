package generics.smartwarehousemanagement;
import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item safely
    public void addItem(T item) {
        items.add(item);
    }

    // Retrieve item
    public T getItem(int index) {
        return items.get(index);
    }

    // Return all items
    public List<T> getItems() {
        return items;
    }
}
