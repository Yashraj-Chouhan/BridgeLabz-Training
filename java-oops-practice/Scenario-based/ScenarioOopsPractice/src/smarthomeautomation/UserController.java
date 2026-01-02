package smarthomeautomation;

public class UserController {

    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();   // Polymorphism
        } else {
            device.turnOff();
        }
    }

    public void compareUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println(a1.name + " uses more power than " + a2.name);
        else if (a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println(a1.name + " uses less power than " + a2.name);
        else
            System.out.println("Both appliances use equal power");
    }
}

