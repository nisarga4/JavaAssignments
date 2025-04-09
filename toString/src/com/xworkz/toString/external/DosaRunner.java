package com.xworkz.toString.external;
import com.xworkz.toString.internal.Dosa;

    public class DosaRunner {
        public static void main(String[] args) {
            Dosa dosa1 = new Dosa("Masala Dosa", true, true, 50.0);
            Dosa dosa2 = new Dosa("Plain Dosa", false, false, 35.0);

            System.out.println(dosa1);
            System.out.println(dosa2);
        }
    }
