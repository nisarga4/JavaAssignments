package com.xworkz.singlelevel;
class Appliance {
    void switchOn() {
        System.out.println("Appliance is turned on.");
    }
}

class Refrigerator extends Appliance {
    void coolItems() {
        System.out.println("Refrigerator is cooling the food.");
    }
}
