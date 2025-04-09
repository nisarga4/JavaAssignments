package com.xworkz.toString.external;
import com.xworkz.toString.internal.Eagle;

    public class EagleRunner {
        public static void main(String[] args) {
            Eagle eagle1 = new Eagle("Bald Eagle", 2.3, "Forests", false);
            Eagle eagle2 = new Eagle("Philippine Eagle", 2.0, "Rainforests", true);

            System.out.println(eagle1);
            System.out.println(eagle2);
        }
    }
