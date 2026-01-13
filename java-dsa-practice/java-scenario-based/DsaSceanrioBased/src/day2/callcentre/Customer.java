package day2.callcentre;
class Customer {
    String name;
    boolean isVIP;

    Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return name + (isVIP ? " [VIP]" : "");
    }
}
