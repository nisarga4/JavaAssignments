package com.xworkz.singlelevel;
class Artist {
    void create() {
        System.out.println("Artist is creating art.");
    }
}

class Painter extends Artist {
    void paint() {
        System.out.println("Painter is painting a landscape.");
    }
}
