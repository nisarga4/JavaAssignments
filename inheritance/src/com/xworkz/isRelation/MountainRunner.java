package com.xworkz.isRelation;


import com.xworkz.inheritance.Mountain;
import com.xworkz.inheritance.Peak;

    public class MountainRunner {
        public static void main(String[] args) {
            Peak peak = new Peak();
            peak.rise();
            peak.attractTourists();
            peak.holdSnow();
            peak.supportWildlife();
            peak.provideView();

            System.out.println("--------------------------------------");

            Mountain mountain = new Peak(); // Polymorphic reference
            mountain.rise();
            mountain.attractTourists();
            mountain.holdSnow();
            mountain.supportWildlife();
            mountain.provideView();
        }
    }

