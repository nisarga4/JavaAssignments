package com.xworkz.hierarchiallevel;
class Appliance {
    void switchOn() {
        System.out.println("Appliance is turned on.");
    }
}

class Fan extends Appliance {
    void spin() {
        System.out.println("Fan is spinning.");
    }
}

class Light extends Appliance {
    void glow() {
        System.out.println("Light is glowing.");
    }
}

class Heater extends Appliance {
    void heat() {
        System.out.println("Heater is heating.");
    }
}
