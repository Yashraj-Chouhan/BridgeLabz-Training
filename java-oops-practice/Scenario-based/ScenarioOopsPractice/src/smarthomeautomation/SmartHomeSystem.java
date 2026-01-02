package smarthomeautomation;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Appliance light = new Light("Bedroom");
        Appliance fan = new Fan("Living Room");
        Appliance ac = new AC("Hall");

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(ac, true);

        controller.compareUsage(light, ac);

        controller.controlDevice(ac, false);
    }
}

