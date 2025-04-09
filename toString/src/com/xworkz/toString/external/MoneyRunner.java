package com.xworkz.toString.external;

import com.xworkz.toString.internal.Money;

    public class MoneyRunner {
        public static void main(String[] args) {
            Money cash1 = new Money("INR", 5000.0, "India", false);
            Money cash2 = new Money("USD", 150.0, "USA", true);

            System.out.println(cash1);
            System.out.println(cash2);
        }
    }
