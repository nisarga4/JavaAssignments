package com.xworkz.toString.external;
import com.xworkz.toString.internal.SugarFree;

    public class SugarFreeRunner {
        public static void main(String[] args) {
            SugarFree product1 = new SugarFree("SugarFree Gold", "Tablets", 100, true);
            SugarFree product2 = new SugarFree("Stevia", "Powder", 200, true);

            System.out.println(product1);
            System.out.println(product2);
        }
    }

