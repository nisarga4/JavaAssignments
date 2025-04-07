package com.xworkz.isRelation;


import com.xworkz.inheritance.Bottle;
import com.xworkz.inheritance.Milton;
import com.xworkz.inheritance.PinkBottel;

    public class PinkBottelRunner {
        public static void main(String[] args) {
            Bottle bottle = new Milton(); // Upcasting to parent
            PinkBottel pinkBottel = new PinkBottel();
            pinkBottel.useBottle(bottle); // Pass parent reference
        }
    }

