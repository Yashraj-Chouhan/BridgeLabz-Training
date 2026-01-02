package smarthomeautomation;

public class Fan extends Appliance {

    Fan(String name) {
        super(name, 120);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(name + " fan spinning at medium speed");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(name + " fan turned OFF");
    }
}

