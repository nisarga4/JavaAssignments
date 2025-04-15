package com.xworkz.hierarchiallevel;
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat says Meow.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog says Bark.");
    }
}

class Elephant extends Animal {
    void trumpet() {
        System.out.println("Elephant trumpets.");
    }
}

