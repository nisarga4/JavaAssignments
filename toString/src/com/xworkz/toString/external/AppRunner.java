package com.xworkz.toString.external;
import com.xworkz.toString.internal.App;

    public class AppRunner {
        public static void main(String[] args) {
            App app1 = new App("WhatsApp", "Meta", 2.23, true);
            App app2 = new App("Minecraft", "Mojang", 1.20, false);

            System.out.println(app1);
            System.out.println(app2);
        }
    }