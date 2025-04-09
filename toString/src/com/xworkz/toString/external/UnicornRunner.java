package com.xworkz.toString.external;

import com.xworkz.toString.internal.Unicorn;

    public class UnicornRunner {
        public static void main(String[] args) {
            Unicorn unicorn1 = new Unicorn("Sparkle", "Rainbow", true, 25.5);
            Unicorn unicorn2 = new Unicorn("Moonlight", "White", false, 20.0);

            System.out.println(unicorn1);
            System.out.println(unicorn2);
        }
    }
