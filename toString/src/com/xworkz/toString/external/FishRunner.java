package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fish;

    public class FishRunner {
        public static void main(String[] args) {
            Fish fish1 = new Fish("Goldfish", "Golden", 0.2, true);
            Fish fish2 = new Fish("Tuna", "Silver", 2.5, false);

            System.out.println(fish1);
            System.out.println(fish2);
        }
    }

