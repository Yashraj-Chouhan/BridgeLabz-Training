package day2.traincompanion;
class Compartment {
    String name;
    boolean hasPantry;
    boolean hasWifi;

    Compartment prev;
    Compartment next;

    Compartment(String name, boolean hasPantry, boolean hasWifi) {
        this.name = name;
        this.hasPantry = hasPantry;
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return name +
               (hasPantry ? " [Pantry]" : "") +
               (hasWifi ? " [WiFi]" : "");
    }
}
