package com.xworkz.toString.external;
import com.xworkz.toString.internal.SoapPowder;

    public class SoapPowderRunner {
        public static void main(String[] args) {
            SoapPowder powder1 = new SoapPowder("Surf Excel", 1.0, true, 120.0);
            SoapPowder powder2 = new SoapPowder("Ariel", 0.5, false, 65.0);

            System.out.println(powder1);
            System.out.println(powder2);
        }
    }
