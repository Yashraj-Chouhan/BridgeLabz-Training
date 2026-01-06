package petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // encapsulated
    private int energy;
    private int mood;

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50) + 30;
        this.energy = rand.nextInt(50) + 30;
        this.mood = rand.nextInt(50) + 30;
    }

    // Encapsulated getters
    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMood() {
        return mood;
    }

    // Interaction methods
    @Override
    public void feed() {
        hunger -= 10;
        energy += 5;
        mood += 5;
        normalize();
        System.out.println(name + " has been fed 🍖");
    }

    @Override
    public void play() {
        hunger += 10;
        energy -= 10;
        mood += 10;
        normalize();
        System.out.println(name + " enjoyed playing 🎾");
    }

    @Override
    public void sleep() {
        energy += 20;
        hunger += 5;
        mood += 5;
        normalize();
        System.out.println(name + " is sleeping 😴");
    }

    // Prevent values from going out of range
    private void normalize() {
        hunger = Math.max(0, Math.min(hunger, 100));
        energy = Math.max(0, Math.min(energy, 100));
        mood = Math.max(0, Math.min(mood, 100));
    }

    // Polymorphic method
    public abstract void makeSound();

    public void showStatus() {
        System.out.println("---- Pet Status ----");
        System.out.println("Name   : " + name);
        System.out.println("Type   : " + type);
        System.out.println("Age    : " + age);
        System.out.println("Hunger : " + hunger);
        System.out.println("Energy : " + energy);
        System.out.println("Mood   : " + mood);
    }
}
