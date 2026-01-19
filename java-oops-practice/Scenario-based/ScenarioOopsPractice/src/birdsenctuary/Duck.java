package birdsenctuary;
@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " flies short distances.");
    }

    public void swim() {
        System.out.println(getName() + " swims in the pond.");
    }

    public void display() {
        System.out.println(getId() + " | " + getName() + " | Duck | Flyable & Swimmable");
    }
}
