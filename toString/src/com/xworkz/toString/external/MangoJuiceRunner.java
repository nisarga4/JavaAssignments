package com.xworkz.toString.external;
import com.xworkz.toString.internal.MangoJuice;

    public class MangoJuiceRunner {
        public static void main(String[] args) {
            MangoJuice juice1 = new MangoJuice("Slice", 250, false, 25.0);
            MangoJuice juice2 = new MangoJuice("Real", 200, true, 30.0);

            System.out.println(juice1);
            System.out.println(juice2);
        }
    }
