package com.xworkz.hybridlevel;

class Gadget {
    void showInfo() {
        System.out.println("This is a gadget.");
    }
}

class Tablet extends Gadget {
    void touchScreen() {
        System.out.println("Tablet with touch screen.");
    }
}

interface StylusSupport {
    void draw();
}

class DrawingTablet extends Tablet implements StylusSupport {
    public void draw() {
        System.out.println("Drawing with stylus.");
    }
}
