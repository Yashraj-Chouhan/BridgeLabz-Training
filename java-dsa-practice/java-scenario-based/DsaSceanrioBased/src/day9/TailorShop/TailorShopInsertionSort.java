package day9.TailorShop;
public class TailorShopInsertionSort {

    // Insertion Sort based on delivery deadline
    public static void insertionSort(Order[] orders) {

        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }

    // Display orders
    public static void displayOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId +
                               ", Deadline: " + o.deadline + " days");
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, 4),
            new Order(102, 8),
            new Order(103, 2),
            new Order(104, 6)
        };

        System.out.println("Before Sorting:");
        displayOrders(orders);

        insertionSort(orders);

        System.out.println("\nAfter Sorting (By Deadline):");
        displayOrders(orders);
    }
}
