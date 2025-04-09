package com.xworkz.toString.external;
import com.xworkz.toString.internal.Engine;

    public class EngineRunner {
        public static void main(String[] args) {
            Engine engine1 = new Engine("Petrol", 150, 1.5, false);
            Engine engine2 = new Engine("Diesel", 180, 2.0, true);

            System.out.println(engine1);
            System.out.println(engine2);
        }
    }

