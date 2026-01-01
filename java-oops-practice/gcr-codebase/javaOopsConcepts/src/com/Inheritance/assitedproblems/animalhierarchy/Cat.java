package com.Inheritance.assitedproblems.animalhierarchy;

public class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow");
    }
}
