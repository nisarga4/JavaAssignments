package com.xworkz.toString.external;
import com.xworkz.toString.internal.Ant;

    public class AntRunner {
        public static void main(String[] args) {
            Ant ant1 = new Ant("Carpenter Ant", "Black", 12.0, false);
            Ant ant2 = new Ant("Fire Ant", "Red", 6.5, true);

            System.out.println(ant1);
            System.out.println(ant2);
        }
    }
