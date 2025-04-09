package com.xworkz.toString.external;
import com.xworkz.toString.internal.Color;

    public class ColorRunner {
        public static void main(String[] args) {
            Color color1 = new Color("Red", "#FF0000", true, "Warm");
            Color color2 = new Color("Green", "#00FF00", true, "Cool");
            Color color3 = new Color("Beige", "#F5F5DC", false, "Neutral");

            System.out.println(color1);
            System.out.println(color2);
            System.out.println(color3);
        }
    }

