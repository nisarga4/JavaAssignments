package com.xworkz.hybridlevel;
class Building {
    void foundation() {
        System.out.println("Building has strong foundation.");
    }
}

class Apartment extends Building {
    void numberOfFloors() {
        System.out.println("This apartment has 5 floors.");
    }
}

interface SmartHome {
    void controlLights();
}

class LuxuryApartment extends Apartment implements SmartHome {
    public void controlLights() {
        System.out.println("Lights controlled by smartphone.");
    }
}
