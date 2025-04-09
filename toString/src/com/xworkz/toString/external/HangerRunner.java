package com.xworkz.toString.external;
import com.xworkz.toString.internal.Hanger;

    public class HangerRunner {
        public static void main(String[] args) {
            Hanger hanger1 = new Hanger("Plastic", "Clothes", true, 1);
            Hanger hanger2 = new Hanger("Metal", "Pants", false, 3);

            System.out.println(hanger1);
            System.out.println(hanger2);
        }
    }
