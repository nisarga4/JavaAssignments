package com.xworkz.multilevel;
class Appliance {
    void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}

class KitchenAppliance extends Appliance {
    void use() {
        System.out.println("Using kitchen appliance.");
    }
}

class Microwave extends KitchenAppliance {
    void heatFood() {
        System.out.println("Microwave is heating food.");
    }
}
