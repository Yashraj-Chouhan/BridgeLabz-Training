package smarthomeautomation;

public class Light extends Appliance {

    Light(String name) {
        super(name, 60);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(name + " light turned ON (Low power usage)");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(name + " light turned OFF");
    }
}
