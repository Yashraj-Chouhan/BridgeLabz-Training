package birdsenctuary;
@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " swims swiftly underwater.");
    }

    public void display() {
        System.out.println(getId() + " | " + getName() + " | Penguin | Swimmable");
    }
}
