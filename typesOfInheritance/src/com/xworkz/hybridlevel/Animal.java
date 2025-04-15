package com.xworkz.hybridlevel;

class Animal {
    void breathe() {
        System.out.println("Animal is breathing.");
    }
}

class Mammal extends Animal {
    void feedMilk() {
        System.out.println("Mammal feeds milk.");
    }
}

interface Pettable {
    void play();
}

class Dog extends Mammal implements Pettable {
    public void play() {
        System.out.println("Dog loves to play.");
    }
}
