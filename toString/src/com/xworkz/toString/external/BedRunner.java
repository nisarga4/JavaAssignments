package com.xworkz.toString.external;
import com.xworkz.toString.internal.Bed;

    public class BedRunner {
        public static void main(String[] args) {
            Bed bed1 = new Bed("Queen", "Wood", true, 15000.0);
            Bed bed2 = new Bed("Single", "Metal", false, 7000.0);

            System.out.println(bed1);
            System.out.println(bed2);
        }
    }
