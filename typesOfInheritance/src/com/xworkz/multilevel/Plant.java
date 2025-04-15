package com.xworkz.multilevel;

class Plant {
    void grow() {
        System.out.println("Plant is growing.");
    }
}

class Tree extends Plant {
    void provideShade() {
        System.out.println("Tree is providing shade.");
    }
}

class MangoTree extends Tree {
    void bearFruit() {
        System.out.println("Mango tree is bearing fruits.");
    }
}
