package day2.traincompanion;
public class Main {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1", false, false);
        train.addCompartment("C2", true, false);
        train.addCompartment("C3", false, true);
        train.addCompartment("C4", false, false);

        train.traverseForward();
        System.out.println();

        train.traverseBackward();
        System.out.println();

        train.searchService("pantry");
        train.searchService("wifi");
        System.out.println();

        train.showAdjacent("C3");
        System.out.println();

        train.removeCompartment("C2");
        train.traverseForward();
    }
}
