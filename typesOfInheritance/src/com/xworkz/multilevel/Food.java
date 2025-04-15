package com.xworkz.multilevel;

class Food {
    void eat() {
        System.out.println("Eating food.");
    }
}

class Fruit extends Food {
    void vitamins() {
        System.out.println("Fruits contain vitamins.");
    }
}

class Mango extends Fruit {
    void taste() {
        System.out.println("Mango tastes sweet.");
    }
}
