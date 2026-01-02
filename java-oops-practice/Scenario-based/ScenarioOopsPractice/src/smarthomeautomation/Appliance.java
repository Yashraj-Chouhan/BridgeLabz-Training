package smarthomeautomation;

public abstract class Appliance implements Controllable {
    protected String name;
    private int powerUsage;
    private boolean isOn;

    Appliance(String name) {
        this.name = name;
        this.powerUsage = 100; // default
    }

    Appliance(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
    }

    protected int getPowerUsage() {
        return powerUsage;
    }

    protected void setStatus(boolean status) {
        this.isOn = status;
    }

    protected boolean isOn() {
        return isOn;
    }
}

