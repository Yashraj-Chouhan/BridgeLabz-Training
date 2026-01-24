package day9.TailorShop;
class Order {
    int orderId;
    int deadline; // delivery deadline in days

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }
}
