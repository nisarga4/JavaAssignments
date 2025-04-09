package com.xworkz.toString.external;
import com.xworkz.toString.internal.Frog;

    public class FrogRunner {
        public static void main(String[] args) {
            Frog frog1 = new Frog("Tree Frog", "Green", false, 150.5);
            Frog frog2 = new Frog("Dart Frog", "Blue", true, 50.0);

            System.out.println(frog1);
            System.out.println(frog2);
        }
    }
