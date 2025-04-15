package com.xworkz.multilevel;
class Organism {
    void grow() {
        System.out.println("Organism is growing.");
    }
}

class Animal extends Organism {
    void move() {
        System.out.println("Animal is moving.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}
