package com.xworkz.toString.external;


import com.xworkz.toString.internal.Drumstick;

    public class DrumstickRunner {
        public static void main(String[] args) {
            Drumstick drum1 = new Drumstick("Moringa", 30.5, true, 80.0);
            Drumstick drum2 = new Drumstick("Hybrid", 25.0, false, 60.0);

            System.out.println(drum1);
            System.out.println(drum2);
        }
    }
