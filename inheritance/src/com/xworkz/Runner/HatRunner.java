package com.xworkz.Runner;

import com.xworkz.Casting.Hat;
import com.xworkz.Casting.HatHandler;
import com.xworkz.Casting.SunHat;

public class HatRunner {
        public static void main(String[] args) {
            Hat hat = new SunHat();  // Upcasting
            HatHandler handler = new HatHandler();
            handler.useHat(hat);
        }
    }
