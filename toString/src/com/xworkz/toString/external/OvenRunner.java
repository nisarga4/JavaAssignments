package com.xworkz.toString.external;

import com.xworkz.toString.internal.Oven;

    public class OvenRunner {
        public static void main(String[] args) {
            Oven oven1 = new Oven("Samsung", 28, true, 8999.0);
            Oven oven2 = new Oven("LG", 32, false, 7499.0);

            System.out.println(oven1);
            System.out.println(oven2);
        }
    }