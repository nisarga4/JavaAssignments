package com.xworkz.toString.external;
import com.xworkz.toString.internal.Home;

    public class HomeRunner {
        public static void main(String[] args) {
            Home home1 = new Home("Raj", "123 MG Road, Bengaluru", 3, true);
            Home home2 = new Home("Anita", "56 Lakeview Street, Mysuru", 2, false);

            System.out.println(home1);
            System.out.println(home2);
        }
    }
