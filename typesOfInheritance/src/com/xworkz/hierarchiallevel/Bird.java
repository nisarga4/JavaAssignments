package com.xworkz.hierarchiallevel;
class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Parrot extends Bird {
    void talk() {
        System.out.println("Parrot can talk.");
    }
}

class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

class Sparrow extends Bird {
    void sing() {
        System.out.println("Sparrow is singing.");
    }
}
