package smarthomeautomation;

public class AC extends Appliance {

    AC(String name) {
        super(name, 1500);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(name + " AC cooling started (High power usage)");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(name + " AC turned OFF");
    }
}

