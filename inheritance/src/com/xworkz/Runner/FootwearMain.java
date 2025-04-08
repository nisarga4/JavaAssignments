package com.xworkz.Runner;

import com.xworkz.Casting.Footwear;
import com.xworkz.Casting.FootwearHandler;
import com.xworkz.Casting.Heels;
import com.xworkz.Casting.Slipper;

public class FootwearMain {
        public static void main(String[] args) {
            FootwearHandler handler = new FootwearHandler();

            Footwear heels = new Heels();
            System.out.println("--- Using Heels ---");
            handler.useFootwear(heels);

            System.out.println("\n--- Using Slipper ---");
            Footwear slipper = new Slipper();
            handler.useFootwear(slipper);
        }
    }
