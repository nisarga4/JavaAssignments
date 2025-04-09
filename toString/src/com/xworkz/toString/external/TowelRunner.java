package com.xworkz.toString.external;
import com.xworkz.toString.internal.Towel;

    public class TowelRunner {
        public static void main(String[] args) {
            Towel towel1 = new Towel("Bombay Dyeing", "Blue", "Cotton", 150.0);
            Towel towel2 = new Towel("Welspun", "White", "Microfiber", 180.0);

            System.out.println(towel1);
            System.out.println(towel2);
        }
    }