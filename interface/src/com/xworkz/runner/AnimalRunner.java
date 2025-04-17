package com.xworkz.runner;


import com.xworkz.intenal.Dog;
import com.xworkz.interfacee.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.move();
        dog.makeSound();
    }
}
