package com.xworkz.toString.external;
import com.xworkz.toString.internal.Army;

    public class ArmyRunner {
        public static void main(String[] args) {
            Army army1 = new Army("India", 1200000, "Infantry", true);
            Army army2 = new Army("USA", 480000, "Armored", true);

            System.out.println(army1);
            System.out.println(army2);
        }
    }
