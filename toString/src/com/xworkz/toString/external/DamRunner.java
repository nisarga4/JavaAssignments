package com.xworkz.toString.external;
import com.xworkz.toString.internal.Dam;

    public class DamRunner {
        public static void main(String[] args) {
            Dam dam1 = new Dam("Bhakra Nangal", "Himachal Pradesh", 226.0, 1963);
            Dam dam2 = new Dam("Sardar Sarovar", "Gujarat", 163.0, 2017);

            System.out.println(dam1);
            System.out.println(dam2);
        }
    }
