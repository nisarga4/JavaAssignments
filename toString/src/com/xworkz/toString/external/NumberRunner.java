package com.xworkz.toString.external;

import com.xworkz.toString.internal.Number;

public class NumberRunner {
    public static void main(String[] args) {
        Number number1 = new Number(25);
        System.out.println(number1);

        int hash = number1.hashCode();
        System.out.println("Hash Code: " + hash);

        Number number2 = new Number(25);
        Number number3 = new Number(30);

        System.out.println("Checking same location: " + (number1 == number2));
        boolean same = number1.equals(number2);
        System.out.println("Number1 is same as Number2: " + same);

        boolean different = number1.equals(number3);
        System.out.println("Number1 is same as Number3: " + different);
    }
}
