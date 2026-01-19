package bagnball;
import java.util.*;

// Bonus Interface
interface Storable {
    void displayInfo();
}

// Ball class
class Ball implements Storable {
    private String id;
    private String color;
    private String size;

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Ball ID: " + id + ", Color: " + color + ", Size: " + size);
    }
}

// Bag class
class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls = new ArrayList<>();

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    // Add ball
    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to bag " + id);
        } else {
            System.out.println("Bag is full! Cannot add more balls.");
        }
    }

    // Remove ball
    public void removeBall(String ballId) {
        balls.removeIf(b -> b.getId().equals(ballId));
    }

    // Display balls
    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ":");
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Bag ID: " + id + ", Color: " + color +
                ", Balls: " + balls.size() + "/" + capacity);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Bag bag1 = new Bag("B1", "Red", 2);

        Ball ball1 = new Ball("BL1", "Blue", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Yellow", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // should be blocked

        bag1.displayBalls();
        bag1.displayInfo();
    }
}
