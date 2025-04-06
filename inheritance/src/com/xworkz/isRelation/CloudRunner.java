package com.xworkz.isRelation;

import com.xworkz.inheritance.Cloud;
import com.xworkz.inheritance.Rain;

    public class CloudRunner {
        public static void main(String[] args) {
            Rain rain = new Rain();
            rain.floatInSky();
            rain.gatherMoisture();
            rain.reflectSunlight();
            rain.formShapes();
            rain.changeColor();

            System.out.println("--------------------------------------");

            Cloud cloud = new Rain(); // Polymorphic reference
            cloud.floatInSky();
            cloud.gatherMoisture();
            cloud.reflectSunlight();
            cloud.formShapes();
            cloud.changeColor();
        }
    }
