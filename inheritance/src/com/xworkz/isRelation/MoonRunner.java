package com.xworkz.isRelation;

import com.xworkz.inheritance.Moon;
import com.xworkz.inheritance.Light;

    public class MoonRunner {
        public static void main(String[] args) {
            Light light = new Light();
            light.rise();
            light.set();
            light.reflectSunlight();
            light.changePhases();
            light.orbitEarth();

            System.out.println("--------------------------------------");

            Moon moon = new Light(); // Polymorphic reference
            moon.rise();
            moon.set();
            moon.reflectSunlight();
            moon.changePhases();
            moon.orbitEarth();
        }
    }

