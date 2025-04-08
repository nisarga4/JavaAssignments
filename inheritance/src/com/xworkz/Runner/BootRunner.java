package com.xworkz.Runner;

import com.xworkz.Casting.Boot;
import com.xworkz.Casting.BootHandler;
import com.xworkz.Casting.WinterBoot;

public class BootRunner {
        public static void main(String[] args) {
            Boot boot = new WinterBoot();  // Upcasting
            BootHandler handler = new BootHandler();
            handler.useBoot(boot);         // Parent reference used
        }
    }
