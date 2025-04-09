package com.xworkz.toString.external;
import com.xworkz.toString.internal.Sunglass;

    public class SunglassRunner {
        public static void main(String[] args) {
            Sunglass sunglass1 = new Sunglass("Ray-Ban", "Aviator", true, 4500.0);
            Sunglass sunglass2 = new Sunglass("Fastrack", "Wayfarer", false, 1200.0);

            System.out.println(sunglass1);
            System.out.println(sunglass2);
        }
    }
