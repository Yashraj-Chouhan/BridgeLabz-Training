package birdsenctuary;
import java.util.*;
import java.lang.reflect.*;

public class Main {

    static ArrayList<Bird> birds = new ArrayList<>();

    // Add bird
    static void addBird(Bird bird) {
        birds.add(bird);
    }

    // Display all birds
    static void displayAll() {
        for (Bird b : birds) {
            b.display();
        }
    }

    // Display flying birds
    static void displayFlyers() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    // Display swimming birds
    static void displaySwimmers() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    // Remove bird by ID
    static void removeById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    // Sanctuary report
    static void report() {
        int fly = 0, swim = 0, both = 0, none = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else none++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }

    // Reflection: Read Annotation
    static void showDeveloperInfo(Bird bird) {
        Class<?> cls = bird.getClass();
        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.developer() +
                    ", Version: " + info.version());
        }
    }

    public static void main(String[] args) {

        addBird(new Eagle("B1", "SkyKing"));
        addBird(new Duck("B2", "Daffy"));
        addBird(new Penguin("B3", "Pingu"));
        addBird(new Kiwi("B4", "KiwiJoe"));

        System.out.println("=== All Birds ===");
        displayAll();

        System.out.println("\n=== Flying Birds ===");
        displayFlyers();

        System.out.println("\n=== Swimming Birds ===");
        displaySwimmers();

        report();

        System.out.println("\n=== Developer Info (Reflection) ===");
        showDeveloperInfo(birds.get(0));
    }
}
