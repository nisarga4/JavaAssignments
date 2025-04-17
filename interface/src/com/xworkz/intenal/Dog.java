package com.xworkz.intenal;


import com.xworkz.interfacee.Animal;

public class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void move() {
        System.out.println("Dog is running.");
    }

    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
