package com.xworkz.Runner;

import com.xworkz.Casting.Appliance;
import com.xworkz.Casting.Microwave;
import com.xworkz.Casting.Technici;

    public class ApplianceRunner {
        public static void main(String[] args) {
            Appliance appliance = new Microwave(); // Upcasting
            Technici technici = new Technici();
            technici.handleAppliance(appliance); // Safe casting + subclass method
        }
    }
