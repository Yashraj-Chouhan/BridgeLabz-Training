package petpal;
public class PetPalDriver {

    public static void main(String[] args) {

        Pet myPet = new Dog("Buddy", 3);   // Polymorphism

        myPet.showStatus();
        myPet.makeSound();

        myPet.feed();
        myPet.play();
        myPet.sleep();

        myPet.showStatus();
    }
}
