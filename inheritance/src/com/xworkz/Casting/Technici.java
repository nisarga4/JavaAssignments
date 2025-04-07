package com.xworkz.Casting;

public class Technici {
        public void handleAppliance(Appliance appliance) {
            appliance.turnOn();
            appliance.operate();
            appliance.clean();
            appliance.repair();
            appliance.turnOff();

            if (appliance instanceof Microwave) {
                Microwave microwave = (Microwave) appliance;
                microwave.setTimer(); // Unique method
            }
        }
    }
