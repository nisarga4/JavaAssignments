package com.xworkz.singlelevel;
class Musician {
    void perform() {
        System.out.println("Musician is performing.");
    }
}

class Guitarist extends Musician {
    void playGuitar() {
        System.out.println("Playing the guitar.");
    }
}
