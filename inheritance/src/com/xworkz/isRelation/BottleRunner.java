package com.xworkz.isRelation;


import com.xworkz.inheritance.Cap;
import com.xworkz.inheritance.Bottle;

    public class BottleRunner {
        public static void main(String[] args) {
            Cap cap = new Cap();
            cap.open();
            cap.close();
            cap.fill();
            cap.empty();
            cap.shake();

            System.out.println("--------------------------------------");

            Bottle bottle = new Cap(); // Polymorphic reference
            bottle.open();
            bottle.close();
            bottle.fill();
            bottle.empty();
            bottle.shake();
        }
    }
