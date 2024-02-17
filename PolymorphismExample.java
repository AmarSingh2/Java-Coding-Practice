package com.selenium.practice;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String args[]) {
        Animal animal = new Animal();  // Creating object of Animal class
        animal.sound();                // Calls sound() method of Animal class
        
        Animal dog = new Dog();        // Creating object of Dog class but referencing Animal class
        dog.sound();                   // Calls overridden sound() method of Dog class
    }
}

