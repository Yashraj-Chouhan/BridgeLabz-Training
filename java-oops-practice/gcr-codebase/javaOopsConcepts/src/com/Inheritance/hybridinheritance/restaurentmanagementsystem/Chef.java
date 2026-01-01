package com.Inheritance.hybridinheritance.restaurentmanagementsystem;

public class Chef extends Person implements Worker{
    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Specialization: " + specialization);
        System.out.println("Duty: Cooking food");
}
}