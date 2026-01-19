package birdsenctuary;
@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
class Kiwi extends Bird {

    public Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }

    public void display() {
        System.out.println(getId() + " | " + getName() + " | Kiwi | Neither Fly nor Swim");
    }
}
