package com.xworkz.toString.external;
import com.xworkz.toString.internal.Panipuri;

    public class PanipuriRunner {
        public static void main(String[] args) {
            Panipuri pani1 = new Panipuri("Mint & Tamarind", true, 6, 25.0);
            Panipuri pani2 = new Panipuri("Sweet & Spicy", false, 8, 30.0);

            System.out.println(pani1);
            System.out.println(pani2);
        }
    }
