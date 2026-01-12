package day1.hospitalunit;

public class HospitalUnit {

    String unitName;
    boolean available;
    HospitalUnit next;

    public HospitalUnit(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}
