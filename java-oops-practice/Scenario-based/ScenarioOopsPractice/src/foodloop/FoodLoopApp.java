package foodloop;
import java.util.*;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem pizza = new VegItem("Margherita Pizza", 300, 5);
        FoodItem burger = new VegItem("Veg Burger", 150, 10);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 4);

        Order order = new Order();

        order.addItem(pizza);
        order.addItem(burger);
        order.addItem(chicken);

        order.placeOrder();
    }
}
