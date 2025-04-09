package com.xworkz.toString.external;
import com.xworkz.toString.internal.Kabab;

    public class KababRunner {
        public static void main(String[] args) {
            Kabab kabab1 = new Kabab("Seekh Kabab", "Mughlai", true, 180.0);
            Kabab kabab2 = new Kabab("Shami Kabab", "Lucknowi", false, 150.0);

            System.out.println(kabab1);
            System.out.println(kabab2);
        }
    }
