package com.encapsulationpolymorphism.librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
